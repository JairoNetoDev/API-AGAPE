package com.agape.squad6.controller;

import com.agape.squad6.config.security.AgapePasswordEncoder;
import com.agape.squad6.config.security.TokenService;
import com.agape.squad6.dto.AutheticationDTO;
import com.agape.squad6.dto.CadastrarDTO;
import com.agape.squad6.dto.LoginResponseDTO;
import com.agape.squad6.model.authentication.exceptions.LoginOrPasswordNotFound;
import com.agape.squad6.model.usuarios.Usuario;
import com.agape.squad6.model.usuarios.exceptions.UsuarioExistenteException;
import com.agape.squad6.repository.UsuarioRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private TokenService tokenService;

    @Operation(
            summary = "Autenticar o Usuário",
            description = "Endpoint que autentica o usuário pelo seu CPF/CNPJ e sua senha cadastrada. Além disso, retorna um token de acesso",
            tags = "Currencies")
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody @Valid AutheticationDTO data) {
        try{
            var usernamePassword = new UsernamePasswordAuthenticationToken(data.login(), data.password());
            var auth = this.authenticationManager.authenticate(usernamePassword);
            var token = this.tokenService.generateToken((Usuario) auth.getPrincipal());
            var usuario = (Usuario) auth.getPrincipal();
            return ResponseEntity.ok(new LoginResponseDTO(usuario.getUsuNome(), usuario.getUsuMail(), token, "O token expira: "+tokenService.getValidadeToken()));
        } catch (BadCredentialsException e){
            throw new LoginOrPasswordNotFound("Usuário ou senha incorretos!");
        }

    }

    @Operation(
            summary = "Cadastrar novo usuário",
            description = "Endpoint para fazer o cadastro de um usuário, passando um email e uma senha",
            tags = "Currencies"
    )
    @PostMapping("/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody @Valid CadastrarDTO data) {
        if (this.usuarioRepository.findByUsuLogin(data.login()) != null) {
            throw new UsuarioExistenteException("Usuário já existente!");
        }

        String encryptedPassword = new AgapePasswordEncoder().encode(data.password());
        Usuario newUsuario = new Usuario(data.login(), encryptedPassword, data.id());
        this.usuarioRepository.save(newUsuario);
        return ResponseEntity.ok("Usuário Cadastrado com Sucesso!");
    }


}
