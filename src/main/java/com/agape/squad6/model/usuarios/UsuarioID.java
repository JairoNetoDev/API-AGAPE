package com.agape.squad6.model.usuarios;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@Embeddable
public class UsuarioID implements java.io.Serializable {
    private static final long serialVersionUID = 2383777195463770758L;
    @NotNull
    @Column(name = "usu_codigo", nullable = false)
    private Integer usuCodigo;

    @NotNull
    @Column(name = "agc_codigo", nullable = false)
    private Integer agcCodigo;

    @Override
    public int hashCode() {
        return Objects.hash(usuCodigo, agcCodigo);
    }

}