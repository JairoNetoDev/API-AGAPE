package com.agape.squad6.model.economico;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_eco_economico", schema = "agtributos")
public class Economico {
    @Id
    @Column(name = "agc_codigo")
    private Integer agcCodigo;

    @Column(name = "atg_codigo")
    private Integer atgCodigo;

    @Column(name = "pes_codigo")
    private Integer pesCodigo;

    @Column(name = "eco_tlf", length = Integer.MAX_VALUE)
    private String ecoTlf;

    @Column(name = "eco_dt_inicio_atividade")
    private LocalDate ecoDtInicioAtividade;

    @Size(max = 20)
    @Column(name = "eco_insc_estadual", length = 20)
    private String ecoInscEstadual;

    @Size(max = 30)
    @Column(name = "eco_insc_municipal", length = 30)
    private String ecoInscMunicipal;

    @Size(max = 15)
    @Column(name = "eco_nr_detran", length = 15)
    private String ecoNrDetran;

    @Size(max = 1)
    @Column(name = "eco_optante_simples", length = 1)
    private String ecoOptanteSimples;

    @Size(max = 1)
    @Column(name = "eco_status", length = 1)
    private String ecoStatus;

    @Column(name = "log_codigo")
    private Integer logCodigo;

    @Size(max = 11)
    @Column(name = "eco_numero", length = 11)
    private String ecoNumero;

    @Column(name = "eco_aliquota", precision = 12, scale = 2)
    private BigDecimal ecoAliquota;

    @Size(max = 1)
    @Column(name = "eco_tipo_atividade", length = 1)
    private String ecoTipoAtividade;

    @Column(name = "eco_aliquota_inss", precision = 12, scale = 2)
    private BigDecimal ecoAliquotaInss;

    @Column(name = "eco_aliquota_irrf", precision = 12, scale = 2)
    private BigDecimal ecoAliquotaIrrf;

    @Column(name = "eco_aliquota_iss", precision = 12, scale = 2)
    private BigDecimal ecoAliquotaIss;

    @Column(name = "pes_codigo_responsavel")
    private Integer pesCodigoResponsavel;

    @Column(name = "eco_observacao", length = Integer.MAX_VALUE)
    private String ecoObservacao;

    @Column(name = "reg_codigo")
    private Integer regCodigo;

    @Size(max = 1)
    @Column(name = "eco_cediada_iss", length = 1)
    private String ecoCediadaIss;

    @Column(name = "eco_valor_contribuicao", precision = 10, scale = 2)
    private BigDecimal ecoValorContribuicao;

    @Column(name = "eco_quant_ufm_tlf", precision = 10, scale = 2)
    private BigDecimal ecoQuantUfmTlf;

    @Column(name = "eco_bloquear_nfse", length = Integer.MAX_VALUE)
    private String ecoBloquearNfse;

    @Size(max = 1)
    @Column(name = "eco_incide_liquido_inss", length = 1)
    private String ecoIncideLiquidoInss;

    @Size(max = 1)
    @Column(name = "eco_incide_liquido_irrf", length = 1)
    private String ecoIncideLiquidoIrrf;

    @Size(max = 1)
    @Column(name = "eco_incide_liquido_iss", length = 1)
    private String ecoIncideLiquidoIss;

    @Size(max = 1)
    @Column(name = "eco_alterar_liquido", length = 1)
    private String ecoAlterarLiquido;

    @Size(max = 100)
    @Column(name = "eco_nome_fantasia", length = 100)
    private String ecoNomeFantasia;

    @Column(name = "eco_aliquota_csll", precision = 12, scale = 2)
    private BigDecimal ecoAliquotaCsll;

    @Column(name = "eco_aliquota_pis", precision = 12, scale = 2)
    private BigDecimal ecoAliquotaPis;

    @Column(name = "eco_aliquota_cofins", precision = 12, scale = 2)
    private BigDecimal ecoAliquotaCofins;

    @Column(name = "eco_area_coberta", precision = 15, scale = 2)
    private BigDecimal ecoAreaCoberta;

    @Column(name = "eco_area_descoberta", precision = 15, scale = 2)
    private BigDecimal ecoAreaDescoberta;

    @Size(max = 1)
    @Column(name = "eco_iss_anual", length = 1)
    private String ecoIssAnual;

    @Column(name = "eco_quant_ufm_iss_anual", precision = 12, scale = 2)
    private BigDecimal ecoQuantUfmIssAnual;

    @Column(name = "imv_codigo")
    private Integer imvCodigo;

    @Column(name = "hor_codigo")
    private Integer horCodigo;

    @Size(max = 1)
    @Column(name = "eco_bloquear_destinatario_nfse", length = 1)
    private String ecoBloquearDestinatarioNfse;

    @Size(max = 1)
    @Column(name = "eco_bloquear_nfse_tlf", length = 1)
    private String ecoBloquearNfseTlf;

    @Size(max = 1)
    @Column(name = "eco_permissionario", length = 1)
    private String ecoPermissionario;

    @Column(name = "eco_dt_permissao")
    private LocalDate ecoDtPermissao;

    @Column(name = "eco_dt_validade")
    private LocalDate ecoDtValidade;

    @Column(name = "tpe_codigo")
    private Integer tpeCodigo;

    @Size(max = 300)
    @Column(name = "eco_endereco", length = 300)
    private String ecoEndereco;

    @Size(max = 200)
    @Column(name = "eco_bairro", length = 200)
    private String ecoBairro;

    @Size(max = 60)
    @Column(name = "eco_numero_endereco", length = 60)
    private String ecoNumeroEndereco;

    @Size(max = 300)
    @Column(name = "eco_complemento", length = 300)
    private String ecoComplemento;

    @Column(name = "mun_codigo_economico")
    private Integer munCodigoEconomico;

    @Size(max = 60)
    @Column(name = "eco_cep", length = 60)
    private String ecoCep;

    @Column(name = "grs_codigo")
    private Integer grsCodigo;

    @Column(name = "coe_codigo")
    private Integer coeCodigo;

    @Column(name = "eco_quant_ufm_tff", precision = 12, scale = 2)
    private BigDecimal ecoQuantUfmTff;

    @Column(name = "eco_tff", length = Integer.MAX_VALUE)
    private String ecoTff;

    @Column(name = "tpt_codigo")
    private Integer tptCodigo;

    @Column(name = "tso_codigo")
    private Integer tsoCodigo;

    @Column(name = "eco_filial")
    private Boolean ecoFilial;

    @Size(max = 10)
    @Column(name = "nat_codigo", length = 10)
    private String natCodigo;

    @Size(max = 18)
    @Column(name = "eco_cnpj_matriz", length = 18)
    private String ecoCnpjMatriz;

    @Size(max = 1)
    @Column(name = "eco_caminhoneiro_autonomo", length = 1)
    private String ecoCaminhoneiroAutonomo;

}