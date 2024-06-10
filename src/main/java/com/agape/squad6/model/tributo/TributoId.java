package com.agape.squad6.model.tributo;

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
public class TributoId implements java.io.Serializable {
    private static final long serialVersionUID = 4595896095525829195L;
    @NotNull
    @Column(name = "tri_codigo", nullable = false)
    private Integer triCodigo;

    @NotNull
    @Column(name = "agc_codigo", nullable = false)
    private Integer agcCodigo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TributoId entity = (TributoId) o;
        return Objects.equals(this.triCodigo, entity.triCodigo) &&
                Objects.equals(this.agcCodigo, entity.agcCodigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(triCodigo, agcCodigo);
    }

}