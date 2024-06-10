package com.agape.squad6.model.arrecadacoes;

import com.agape.squad6.model.economico.Economico;
import com.agape.squad6.model.pessoa.Pessoa;
import com.agape.squad6.model.tributo.Tributo;
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
@Table(name = "tb_arr_arrecadacao", schema = "agtributos")
public class Arrecadacao {
    @EmbeddedId
    private ArrecadacaoId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name = "agc_codigo", referencedColumnName = "agc_codigo", insertable = false, updatable = false),
        @JoinColumn(name = "pes_codigo", referencedColumnName = "pes_codigo", insertable = false, updatable = false)
    })
    @JsonIgnore
    private Pessoa pessoa;

    @Column(name = "arr_valor_total", precision = 12, scale = 2)
    private BigDecimal arrValorTotal;

    @Column(name = "arr_valor_desconto", precision = 12, scale = 2)
    private BigDecimal arrValorDesconto;

    @Column(name = "arr_valor_juros", precision = 12, scale = 2)
    private BigDecimal arrValorJuros;

    @Column(name = "arr_valor_multa", precision = 12, scale = 2)
    private BigDecimal arrValorMulta;

    @Column(name = "arr_valor_correcao_monetaria", precision = 12, scale = 2)
    private BigDecimal arrValorCorrecaoMonetaria;

    @Column(name = "arr_valor_taxa_expediente", precision = 12, scale = 2)
    private BigDecimal arrValorTaxaExpediente;

    @Column(name = "arr_valor_corrigido", precision = 12, scale = 2)
    private BigDecimal arrValorCorrigido;

    @Column(name = "arr_valor_pago", precision = 12, scale = 2)
    private BigDecimal arrValorPago;

    @Column(name = "arr_taxa_adicional", precision = 12, scale = 2)
    private BigDecimal arrTaxaAdicional;

    @Column(name = "arr_dt_pagamento")
    private LocalDate arrDtPagamento;

    @Size(max = 45)
    @Column(name = "arr_codigo_barras", length = 45)
    private String arrCodigoBarras;

    @Size(max = 50)
    @Column(name = "arr_codigo_digitavel", length = 50)
    private String arrCodigoDigitavel;

    @Column(name = "arr_observacao", length = Integer.MAX_VALUE)
    private String arrObservacao;

    @Column(name = "arr_dt_emissao")
    private LocalDate arrDtEmissao;

    @Column(name = "arr_quant_parcela")
    private Integer arrQuantParcela;

    @Column(name = "arr_dt_vencimento")
    private LocalDate arrDtVencimento;

    @Column(name = "arr_subtotal", precision = 12, scale = 2)
    private BigDecimal arrSubtotal;

    @Column(name = "arr_dt_baixa")
    private LocalDate arrDtBaixa;

    @Column(name = "arr_status", length = Integer.MAX_VALUE)
    private String arrStatus;

    @Column(name = "arr_aliquota", precision = 6, scale = 2)
    private BigDecimal arrAliquota;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "tri_codigo", referencedColumnName = "tri_codigo", insertable = false, updatable = false),
            @JoinColumn(name = "agc_codigo", referencedColumnName = "agc_codigo", insertable = false, updatable = false)
    })
    @JsonIgnore
    private Tributo tributo;

    @Size(max = 1)
    @Column(name = "arr_tipo", length = 1)
    private String arrTipo;

    @Size(max = 25)
    @Column(name = "arr_nosso_numero", length = 25)
    private String arrNossoNumero;

    @Column(name = "arr_codigo_digitavel_formatado", length = Integer.MAX_VALUE)
    private String arrCodigoDigitavelFormatado;

//    @ManyToOne(fetch = FetchType.LAZY)
//    private Arrecadacao tbArrArrecadacao;

    @Column(name = "arr_codigo_anterior")
    private Integer arrCodigoAnterior;

    @Column(name = "arr_num_controle")
    private Integer arrNumControle;

    @Size(max = 44)
    @Column(name = "arr_codigo_barra_anterior", length = 44)
    private String arrCodigoBarraAnterior;

    @Size(max = 50)
    @Column(name = "arr_digitavel_anterior", length = 50)
    private String arrDigitavelAnterior;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumns({
//            @JoinColumn(name = "eco_codigo", referencedColumnName = "eco_codigo", insertable = false, updatable = false),
//            @JoinColumn(name = "agc_codigo", referencedColumnName = "agc_codigo", insertable = false, updatable = false)
//
//    })
//    private Economico tbEcoEconomico;

    @Column(name = "arr_motivo_cancelamento_dam", length = Integer.MAX_VALUE)
    private String arrMotivoCancelamentoDam;

    @Column(name = "usu_codigo")
    private Integer usuCodigo;

    @Size(max = 10)
    @Column(name = "arr_mes_referencia", length = 10)
    private String arrMesReferencia;

    @Size(max = 1)
    @Column(name = "arr_tipo_calculo", length = 1)
    private String arrTipoCalculo;

    @Column(name = "arr_quant_ufm", precision = 6, scale = 2)
    private BigDecimal arrQuantUfm;

    @Size(max = 30)
    @Column(name = "arr_codigo_exportacao", length = 30)
    private String arrCodigoExportacao;

    @Column(name = "arr_ajuste_conversao")
    private Boolean arrAjusteConversao;

}