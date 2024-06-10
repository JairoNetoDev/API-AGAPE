package com.agape.squad6.model.pessoa;

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
public class PessoaId implements java.io.Serializable {
    private static final long serialVersionUID = 2383777195463770758L;
    @NotNull
    @Column(name = "pes_codigo", nullable = false)
    private Integer pesCodigo;

    @NotNull
    @Column(name = "agc_codigo", nullable = false)
    private Integer agcCodigo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PessoaId entity = (PessoaId) o;
        return Objects.equals(this.pesCodigo, entity.pesCodigo) &&
                Objects.equals(this.agcCodigo, entity.agcCodigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pesCodigo, agcCodigo);
    }

}