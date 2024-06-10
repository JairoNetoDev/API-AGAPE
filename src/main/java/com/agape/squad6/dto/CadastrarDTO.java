package com.agape.squad6.dto;

import com.agape.squad6.model.usuarios.UsuarioID;

public record CadastrarDTO(String login, String password, UsuarioID id) {
}
