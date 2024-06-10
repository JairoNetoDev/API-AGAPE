package com.agape.squad6.model.usuarios;

import com.agape.squad6.model.cliente.Cliente;
import com.agape.squad6.model.usuarioContribuinte.UsuarioContribuinte;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_usu_usuario", schema = "agportal", indexes = {
        @Index(name = "Ref14", columnList = "agc_codigo"),
        @Index(name = "Ref1114", columnList = "agf_codigo"),
        @Index(name = "idx_tb_usu_usuario_usu_login_usu_pwd_agc_codigo", columnList = "usu_login, usu_pwd, agc_codigo")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uk_tb_usu_usuario", columnNames = {"agc_codigo", "usu_login"})
})

public class Usuario implements Serializable,UserDetails {

    @EmbeddedId
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private UsuarioID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agc_codigo", referencedColumnName = "agc_codigo", insertable = false, updatable = false)
    @JsonIgnore
    private Cliente cliente;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "agc_codigo", referencedColumnName = "agc_codigo", insertable = false, updatable = false),
            @JoinColumn(name = "usu_codigo", referencedColumnName = "usu_codigo", insertable = false, updatable = false)
    })
    @JsonIgnore
    private UsuarioContribuinte usuarioContribuinte;

    @Size(max = 20)
    @Column(name = "usu_login", length = 20)
    private String usuLogin;

    @Size(max = 32)
    @Column(name = "usu_pwd", length = 32)
    private String usuPwd;

    @Size(max = 60)
    @Column(name = "usu_nome", length = 60)
    private String usuNome;

    @Size(max = 50)
    @Column(name = "usu_mail", length = 50)
    private String usuMail;

    @Size(max = 1)
    @Column(name = "usu_sexo", length = 1)
    private String usuSexo;

    @Column(name = "usu_foto")
    private byte[] usuFoto;

    @Column(name = "usu_dt_nascimento")
    private LocalDate usuDtNascimento;

    @Size(max = 1)
    @Column(name = "usu_situacao", length = 1)
    private String usuSituacao;

    @Size(max = 32)
    @Column(name = "usu_chave_alt_senha", length = 32)
    private String usuChaveAltSenha;

    @Column(name = "usu_situacao_alt_senha", length = Integer.MAX_VALUE)
    private String usuSituacaoAltSenha;

    @Size(max = 1)
    @Column(name = "usu_master", length = 1)
    private String usuMaster;

    @Column(name = "usu_flag_email_alerta", length = Integer.MAX_VALUE)
    private String usuFlagEmailAlerta;

    @Column(name = "usu_dt_cadastro")
    private LocalDate usuDtCadastro;

    @Column(name = "usu_motivo_inativacao", length = Integer.MAX_VALUE)
    private String usuMotivoInativacao;

    @Column(name = "usu_bi")
    private Boolean usuBi;

    @Size(max = 30)
    @Column(name = "usu_bd", length = 30)
    private String usuBd;

    @Size(max = 14)
    @Column(name = "usu_cpf", length = 14)
    private String usuCpf;

    @Size(max = 14)
    @Column(name = "usu_telefone", length = 14)
    private String usuTelefone;

    @Column(name = "usu_expirar_pwd")
    private Boolean usuExpirarPwd;

    @Column(name = "usu_dt_expirar_pwd")
    private LocalDate usuDtExpirarPwd;

    @Size(max = 32)
    @Column(name = "usu_token", length = 32)
    private String usuToken;

    @Column(name = "usu_recadastramento")
    private Boolean usuRecadastramento;

    @Column(name = "usu_dt_recadastramento")
    private LocalDate usuDtRecadastramento;

    @Size(max = 1)
    @Column(name = "usu_beta", length = 1)
    private String usuBeta;

    @Size(max = 1)
    @Column(name = "usu_master_agin", length = 1)
    private String usuMasterAgin;

    @Size(max = 1)
    @Column(name = "usu_acesso_administrador", length = 1)
    private String usuAcessoAdministrador;

    @Size(max = 15)
    @Column(name = "usu_rg", length = 15)
    private String usuRg;

    @Size(max = 200)
    @Column(name = "usu_setor", length = 200)
    private String usuSetor;

    @Size(max = 14)
    @Column(name = "usu_celular", length = 14)
    private String usuCelular;

    @Size(max = 150)
    @Column(name = "usu_cargo", length = 150)
    private String usuCargo;

    @Column(name = "usu_access_token", length = Integer.MAX_VALUE)
    private String usuAccessToken;

    public Usuario(String login, String senha, UsuarioID id) {
        this.usuLogin = login;
        this.usuPwd = senha;
        this.id = id;

    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getPassword() {
        return usuPwd;
    }

    @Override
    public String getUsername() {
        return usuLogin;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}