package com.agape.squad6.model.cobranca;

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
public class CobrancaId implements java.io.Serializable {
    private static final long serialVersionUID = 1379855249891319232L;
    @NotNull
    @Column(name = "cob_codigo", nullable = false)
    private Integer cobCodigo;

    @NotNull
    @Column(name = "agc_codigo", nullable = false)
    private Integer agcCodigo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CobrancaId entity = (CobrancaId) o;
        return Objects.equals(this.cobCodigo, entity.cobCodigo) &&
                Objects.equals(this.agcCodigo, entity.agcCodigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cobCodigo, agcCodigo);
    }

}