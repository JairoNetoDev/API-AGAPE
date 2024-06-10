package com.agape.squad6.model.usuarioContribuinte;

import com.agape.squad6.model.pessoa.Pessoa;
import com.agape.squad6.model.usuarios.Usuario;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_usc_usuario_contribuinte", schema = "agtributos")
public class UsuarioContribuinte {
    @EmbeddedId
    private UsuarioContribuinteId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumns({
            @JoinColumn(name = "pes_codigo", referencedColumnName = "pes_codigo", insertable=false, updatable=false),
            @JoinColumn(name = "agc_codigo", referencedColumnName = "agc_codigo", insertable=false, updatable=false)
    })
    private Pessoa pessoa;

    @OneToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumns({
            @JoinColumn(name = "usu_codigo", referencedColumnName = "usu_codigo", insertable=false, updatable=false),
            @JoinColumn(name = "agc_codigo", referencedColumnName = "agc_codigo", insertable=false, updatable=false)
    })
    private Usuario usuario;

}