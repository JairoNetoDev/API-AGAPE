package com.agape.squad6.model.tributo;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "tb_tri_tributo", schema = "agtributos", indexes = {
        @Index(name = "Ref46110", columnList = "agc_codigo, tit_codigo"),
        @Index(name = "Ref136", columnList = "agc_codigo"),
        @Index(name = "Ref21134", columnList = "cot_codigo, agc_codigo")
})
public class Tributo {
    @EmbeddedId
    private TributoId id;

    @Size(max = 10)
    @Column(name = "tri_sigla", length = 10)
    private String triSigla;

    @Size(max = 50)
    @Column(name = "tri_descricao", length = 50)
    private String triDescricao;

    @Column(name = "tri_aliquota", precision = 6, scale = 2)
    private BigDecimal triAliquota;

    @Column(name = "tit_codigo")
    private Integer titCodigo;

    @Column(name = "cot_codigo")
    private Integer cotCodigo;

    @Column(name = "tri_tx_expediente", precision = 10, scale = 2)
    private BigDecimal triTxExpediente;

    @Column(name = "plc_codigo")
    private Integer plcCodigo;

    @Column(name = "tri_quant_dias_certidao")
    private Integer triQuantDiasCertidao;

    @Column(name = "tri_fundamento", length = Integer.MAX_VALUE)
    private String triFundamento;

    @Column(name = "tri_natureza_divida", length = Integer.MAX_VALUE)
    private String triNaturezaDivida;

    @Column(name = "tri_forma_constituicao", length = Integer.MAX_VALUE)
    private String triFormaConstituicao;

    @Size(max = 1)
    @Column(name = "tri_status", length = 1)
    private String triStatus;

    @Column(name = "plc_tributo_exercicio")
    private Integer plcTributoExercicio;

    @Column(name = "plc_juros_multa_exercicio")
    private Integer plcJurosMultaExercicio;

    @Column(name = "plc_divida_ativa_tributo")
    private Integer plcDividaAtivaTributo;

    @Column(name = "plc_juros_multa_divida_ativa_tributo")
    private Integer plcJurosMultaDividaAtivaTributo;

    @Column(name = "plc_taxa_adicionais")
    private Integer plcTaxaAdicionais;

    @Column(name = "plc_taxa_expediente")
    private Integer plcTaxaExpediente;

    @Column(name = "plc_desconto_tributo_exercicio")
    private Integer plcDescontoTributoExercicio;

    @Column(name = "plc_desconto_tributo_juros_multa_exercicio")
    private Integer plcDescontoTributoJurosMultaExercicio;

    @Column(name = "plc_desconto_divida_ativa_tributo_exercicio")
    private Integer plcDescontoDividaAtivaTributoExercicio;

    @Column(name = "plc_desconto_divida_ativa_juros_multa_exercicio")
    private Integer plcDescontoDividaAtivaJurosMultaExercicio;

    @Column(name = "agc_plc_codigo")
    private Integer agcPlcCodigo;

}