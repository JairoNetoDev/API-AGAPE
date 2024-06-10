package com.agape.squad6.repository;

import com.agape.squad6.model.usuarios.Usuario;
import com.agape.squad6.model.usuarios.UsuarioID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, UsuarioID> {
    Usuario findByUsuLogin(String usuLogin);
}