package com.agape.squad6.model.arrecadacoes;

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
public class ArrecadacaoId implements java.io.Serializable {
    private static final long serialVersionUID = -4858082146028143340L;
    @NotNull
    @Column(name = "agc_codigo", nullable = false)
    private Integer agcCodigo;

    @NotNull
    @Column(name = "arr_codigo", nullable = false)
    private Integer arrCodigo;

    @NotNull
    @Column(name = "exe_ano", nullable = false)
    private Integer exeAno;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ArrecadacaoId entity = (ArrecadacaoId) o;
        return Objects.equals(this.arrCodigo, entity.arrCodigo) &&
                Objects.equals(this.exeAno, entity.exeAno) &&
                Objects.equals(this.agcCodigo, entity.agcCodigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arrCodigo, exeAno, agcCodigo);
    }

}