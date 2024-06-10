package com.agape.squad6.model.usuarioContribuinte;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@Embeddable
public class UsuarioContribuinteId implements java.io.Serializable {
    private static final long serialVersionUID = -5584066916451562780L;
    @NotNull
    @Column(name = "agc_codigo", nullable = false)
    private Integer agcCodigo;

    @NotNull
    @Column(name = "usc_codigo", nullable = false)
    private Integer uscCodigo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UsuarioContribuinteId entity = (UsuarioContribuinteId) o;
        return Objects.equals(this.uscCodigo, entity.uscCodigo) &&
                Objects.equals(this.agcCodigo, entity.agcCodigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uscCodigo, agcCodigo);
    }

}