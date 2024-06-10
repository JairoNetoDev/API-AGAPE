package com.agape.squad6.model.cobranca;

import com.agape.squad6.model.arrecadacoes.Arrecadacao;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "tb_cob_cobranca", schema = "agtributos", indexes = {
        @Index(name = "idx_arrecadaca", columnList = "agc_codigo, arr_codigo, exe_ano"),
        @Index(name = "idx_recobranca", columnList = "agc_codigo, rec_codigo, exe_ano"),
        @Index(name = "idx_codigo_barra", columnList = "agc_codigo, cob_nosso_numero, cob_codigo_barras")
})
public class Cobranca {
    @EmbeddedId
    private CobrancaId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "agc_codigo", referencedColumnName = "agc_codigo", insertable = false, updatable = false),
            @JoinColumn(name = "arr_codigo", referencedColumnName = "arr_codigo", insertable = false, updatable = false),
            @JoinColumn(name = "exe_ano", referencedColumnName = "exe_ano", insertable = false, updatable = false)
    })
    @JsonIgnore
    private Arrecadacao arrecadacao;

    @Column(name = "cob_dt_emissao")
    private LocalDate cobDtEmissao;

    @Column(name = "cob_dt_vencimento")
    private LocalDate cobDtVencimento;

    @Column(name = "cob_subtotal", precision = 12)
    private BigDecimal cobSubtotal;

    @Column(name = "cob_valor_total", precision = 12)
    private BigDecimal cobValorTotal;

    @Column(name = "cob_valor_desconto", precision = 12)
    private BigDecimal cobValorDesconto;

    @Column(name = "cob_valor_entrada", precision = 12)
    private BigDecimal cobValorEntrada;

    @Column(name = "cob_valor_juros", precision = 12)
    private BigDecimal cobValorJuros;

    @Column(name = "cob_valor_multa", precision = 12)
    private BigDecimal cobValorMulta;

    @Column(name = "cob_valor_correcao_monetaria", precision = 12)
    private BigDecimal cobValorCorrecaoMonetaria;

    @Column(name = "cob_valor_taxa_expediente", precision = 12)
    private BigDecimal cobValorTaxaExpediente;

    @Column(name = "cob_taxa_adicional", precision = 12)
    private BigDecimal cobTaxaAdicional;

    @Column(name = "cob_valor_corrigido", precision = 12)
    private BigDecimal cobValorCorrigido;

    @Size(max = 45)
    @Column(name = "cob_codigo_barras", length = 45)
    private String cobCodigoBarras;

    @Size(max = 50)
    @Column(name = "cob_codigo_digitavel", length = 50)
    private String cobCodigoDigitavel;

    @Column(name = "cob_codigo_digitavel_formatado", length = Integer.MAX_VALUE)
    private String cobCodigoDigitavelFormatado;

    @Size(max = 25)
    @Column(name = "cob_nosso_numero", length = 25)
    private String cobNossoNumero;

    @Size(max = 1)
    @Column(name = "cob_status", length = 1)
    private String cobStatus;

    @Column(name = "cob_dt_pagamento")
    private LocalDate cobDtPagamento;

    @Column(name = "cob_valor_pago", precision = 12)
    private BigDecimal cobValorPago;

    @Column(name = "usu_codigo")
    private Integer usuCodigo;

    @Column(name = "cob_observacao", length = Integer.MAX_VALUE)
    private String cobObservacao;

    @Size(max = 50)
    @Column(name = "cob_codigo_exportacao", length = 50)
    private String cobCodigoExportacao;

    @Column(name = "cob_json_bb", length = Integer.MAX_VALUE)
    private String cobJsonBb;

}