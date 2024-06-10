package com.agape.squad6.model.configuracao;

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

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cof_configuracao", schema = "agtributos")
public class Configuracao {
    @Id
    @Column(name = "agc_codigo")
    private Integer agcCodigo;

    @Size(max = 80)
    @Column(name = "cof_nome_secretario", length = 80)
    private String cofNomeSecretario;

    @Size(max = 80)
    @Column(name = "cof_nome_responsavel", length = 80)
    private String cofNomeResponsavel;

    @Column(name = "cof_forma_gerar_iptu", length = Integer.MAX_VALUE)
    private String cofFormaGerarIptu;

    @Size(max = 10)
    @Column(name = "cof_codigo_municipio", length = 10)
    private String cofCodigoMunicipio;

    @Column(name = "cof_perc_area_terreno", precision = 6, scale = 2)
    private BigDecimal cofPercAreaTerreno;

    @Column(name = "cof_perc_area_construcao", precision = 6, scale = 2)
    private BigDecimal cofPercAreaConstrucao;

    @Column(name = "cof_prazo_certidao")
    private Integer cofPrazoCertidao;

    @Column(name = "cof_num_publico", length = Integer.MAX_VALUE)
    private String cofNumPublico;

    @Column(name = "tri_iss_nota_fiscal")
    private Integer triIssNotaFiscal;

    @Column(name = "tri_irrf_nota_fiscal")
    private Integer triIrrfNotaFiscal;

    @Column(name = "cof_tx_expediente", precision = 10, scale = 2)
    private BigDecimal cofTxExpediente;

    @Column(name = "cot_codigo")
    private Integer cotCodigo;

    @Size(max = 1)
    @Column(name = "cof_tipo_geracao_valor", length = 1)
    private String cofTipoGeracaoValor;

    @Column(name = "cof_quant_dias_cancelamento")
    private Integer cofQuantDiasCancelamento;

    @Size(max = 1)
    @Column(name = "cof_flag_canc_contribuinte", length = 1)
    private String cofFlagCancContribuinte;

    @Column(name = "cof_quant_dias_vencimento")
    private Integer cofQuantDiasVencimento;

    @Column(name = "cof_certificado")
    private byte[] cofCertificado;

    @Size(max = 30)
    @Column(name = "cof_nome_certificado", length = 30)
    private String cofNomeCertificado;

    @Size(max = 2)
    @Column(name = "cof_tipo_certificado", length = 2)
    private String cofTipoCertificado;

    @Size(max = 30)
    @Column(name = "cof_senha_certificado", length = 30)
    private String cofSenhaCertificado;

    @Size(max = 1)
    @Column(name = "cof_aliq_iss_contribuinte", length = 1)
    private String cofAliqIssContribuinte;

    @Column(name = "tri_alvara")
    private Integer triAlvara;

    @Column(name = "tri_itbi")
    private Integer triItbi;

    @Size(max = 150)
    @Column(name = "cof_acesso_nfse", length = 150)
    private String cofAcessoNfse;

    @Column(name = "tri_iptu")
    private Integer triIptu;

    @Column(name = "tri_tlf")
    private Integer triTlf;

    @Column(name = "tri_tff")
    private Integer triTff;

    @Size(max = 200)
    @Column(name = "cof_calculo_iptu", length = 200)
    private String cofCalculoIptu;

    @Size(max = 1)
    @Column(name = "cof_forma_calculo_multa", length = 1)
    private String cofFormaCalculoMulta;

    @Column(name = "cof_aliquota_juros", precision = 10, scale = 2)
    private BigDecimal cofAliquotaJuros;

    @Size(max = 1)
    @Column(name = "cof_juros_diferenciado", length = 1)
    private String cofJurosDiferenciado;

    @Column(name = "cof_porta_open_office")
    private Integer cofPortaOpenOffice;

    @Size(max = 80)
    @Column(name = "cof_host_open_office", length = 80)
    private String cofHostOpenOffice;

    @Size(max = 1)
    @Column(name = "cof_flag_atividade_economico", length = 1)
    private String cofFlagAtividadeEconomico;

    @Column(name = "reg_codigo")
    private Integer regCodigo;

    @Size(max = 1)
    @Column(name = "cof_transferencia_imovel", length = 1)
    private String cofTransferenciaImovel;

    @Size(max = 1)
    @Column(name = "cof_aliq_inss_contribuinte", length = 1)
    private String cofAliqInssContribuinte;

    @Size(max = 1)
    @Column(name = "cof_flag_altera_insc_mun", length = 1)
    private String cofFlagAlteraInscMun;

    @Size(max = 1)
    @Column(name = "cof_imp_dam", length = 1)
    private String cofImpDam;

    @Column(name = "tri_iss_mensal")
    private Integer triIssMensal;

    @Size(max = 1)
    @Column(name = "cof_calcula_irrf", length = 1)
    private String cofCalculaIrrf;

    @Size(max = 1)
    @Column(name = "cof_flag_altera_natureza", length = 1)
    private String cofFlagAlteraNatureza;

    @Size(max = 1)
    @Column(name = "cof_flag_lote_imovel", length = 1)
    private String cofFlagLoteImovel;

    @Size(max = 1)
    @Column(name = "cof_flag_responsavel_economico", length = 1)
    private String cofFlagResponsavelEconomico;

    @Column(name = "tri_contribuicao")
    private Integer triContribuicao;

    @Size(max = 200)
    @Column(name = "cof_base_calculo_iptu", length = 200)
    private String cofBaseCalculoIptu;

    @Size(max = 80)
    @Column(name = "cof_nome_sec_certidao", length = 80)
    private String cofNomeSecCertidao;

    @Size(max = 1)
    @Column(name = "cof_renumera_alvara", length = 1)
    private String cofRenumeraAlvara;

    @Column(name = "cof_aliquota_itbi_financiado", precision = 12, scale = 2)
    private BigDecimal cofAliquotaItbiFinanciado;

    @Column(name = "cof_dia_gerar_iss")
    private Integer cofDiaGerarIss;

    @Column(name = "tri_iss_eletronica")
    private Integer triIssEletronica;

    @Column(name = "cof_presc_divida_aut", length = Integer.MAX_VALUE)
    private String cofPrescDividaAut;

    @Column(name = "cof_anos_prescrever")
    private Integer cofAnosPrescrever;

    @Column(name = "cof_quant_dias_certidao")
    private Integer cofQuantDiasCertidao;

    @Column(name = "cof_quant_dias_bloqueio_nfse")
    private Integer cofQuantDiasBloqueioNfse;

    @Column(name = "oco_inativa_economico")
    private Integer ocoInativaEconomico;

    @Column(name = "cof_quant_dias_certidao_simples")
    private Integer cofQuantDiasCertidaoSimples;

    @Column(name = "cof_mensagem_pagamento", length = Integer.MAX_VALUE)
    private String cofMensagemPagamento;

    @Size(max = 1)
    @Column(name = "cof_flag_pis_nfa", length = 1)
    private String cofFlagPisNfa;

    @Column(name = "tri_iss_banco")
    private Integer triIssBanco;

    @Column(name = "tri_entrada_recobranca")
    private Integer triEntradaRecobranca;

    @Column(name = "tri_iss_retido")
    private Integer triIssRetido;

    @Column(name = "cof_quant_dias_vencidos_cobrar_juros")
    private Integer cofQuantDiasVencidosCobrarJuros;

    @Column(name = "cof_valor_min_parcela_rec_fisica", precision = 15, scale = 2)
    private BigDecimal cofValorMinParcelaRecFisica;

    @Column(name = "cof_valor_min_parcela_rec_juridica", precision = 15, scale = 2)
    private BigDecimal cofValorMinParcelaRecJuridica;

    @Column(name = "cof_alvara_termino_exercicio", length = Integer.MAX_VALUE)
    private String cofAlvaraTerminoExercicio;

    @Size(max = 1)
    @Column(name = "cof_contribuinte_emite_certidao", length = 1)
    private String cofContribuinteEmiteCertidao;

    @Column(name = "tri_certidao")
    private Integer triCertidao;

    @Column(name = "cof_dias_venc_iss_retido")
    private Integer cofDiasVencIssRetido;

    @Column(name = "cof_dia_limite_iss_banco")
    private Integer cofDiaLimiteIssBanco;

    @Size(max = 1)
    @Column(name = "cof_juros_multa_final_semana", length = 1)
    private String cofJurosMultaFinalSemana;

    @Column(name = "cof_quant_dias_cancelamento_iss_banco")
    private Integer cofQuantDiasCancelamentoIssBanco;

    @Column(name = "cof_quant_dias_venc_alvara")
    private Integer cofQuantDiasVencAlvara;

    @Size(max = 300)
    @Column(name = "cof_acesso_iss_banco", length = 300)
    private String cofAcessoIssBanco;

    @Size(max = 1)
    @Column(name = "cof_calculo_correcao_mensal", length = 1)
    private String cofCalculoCorrecaoMensal;

    @Column(name = "tri_auto_infracao")
    private Integer triAutoInfracao;

    @Column(name = "cof_quant_dias_venc_auto_infracao")
    private Integer cofQuantDiasVencAutoInfracao;

    @Column(name = "cof_lei_divida_ativa", length = Integer.MAX_VALUE)
    private String cofLeiDividaAtiva;

    @Column(name = "tri_codigo_iss_anual")
    private Integer triCodigoIssAnual;

    @Column(name = "cof_quant_dias_retifica_iss_banco")
    private Integer cofQuantDiasRetificaIssBanco;

    @Size(max = 1)
    @Column(name = "cof_nao_gera_iss_fora_municipio", length = 1)
    private String cofNaoGeraIssForaMunicipio;

    @Size(max = 1)
    @Column(name = "cof_imprimir_validacao_certidao", length = 1)
    private String cofImprimirValidacaoCertidao;

    @Size(max = 300)
    @Column(name = "cof_acesso_certidao", length = 300)
    private String cofAcessoCertidao;

    @Column(name = "cof_dia_limite_iss_retido")
    private Integer cofDiaLimiteIssRetido;

    @Column(name = "cof_perc_maximo_iptu_progressivo", precision = 6, scale = 2)
    private BigDecimal cofPercMaximoIptuProgressivo;

    @Column(name = "cof_perc_anual_iptu_progressivo", precision = 6, scale = 2)
    private BigDecimal cofPercAnualIptuProgressivo;

    @Column(name = "cof_aliquota_itbi_nao_escriturado", precision = 6, scale = 2)
    private BigDecimal cofAliquotaItbiNaoEscriturado;

    @Column(name = "cof_aliquota_iss_mei", precision = 12, scale = 2)
    private BigDecimal cofAliquotaIssMei;

    @Column(name = "reg_codigo_mei")
    private Integer regCodigoMei;

    @Size(max = 1)
    @Column(name = "cof_renumerar_certidao", length = 1)
    private String cofRenumerarCertidao;

    @Size(max = 1)
    @Column(name = "cof_flag_quadra_setor", length = 1)
    private String cofFlagQuadraSetor;

    @Size(max = 1)
    @Column(name = "cof_flag_ocupacao", length = 1)
    private String cofFlagOcupacao;

    @Size(max = 1)
    @Column(name = "cof_flag_area_imovel", length = 1)
    private String cofFlagAreaImovel;

    @Size(max = 1)
    @Column(name = "cof_flag_regime_tributario", length = 1)
    private String cofFlagRegimeTributario;

    @Size(max = 1)
    @Column(name = "cof_flag_altera_emissao_nota", length = 1)
    private String cofFlagAlteraEmissaoNota;

    @Size(max = 1)
    @Column(name = "cof_flag_intermediario", length = 1)
    private String cofFlagIntermediario;

    @Size(max = 1)
    @Column(name = "cof_flag_detalhamento_construcao", length = 1)
    private String cofFlagDetalhamentoConstrucao;

    @Column(name = "cof_certificado_jks")
    private byte[] cofCertificadoJks;

    @Size(max = 200)
    @Column(name = "cof_nome_certificado_jks", length = 200)
    private String cofNomeCertificadoJks;

    @Column(name = "cof_origem_divida_ativa", length = Integer.MAX_VALUE)
    private String cofOrigemDividaAtiva;

    @Column(name = "cof_quant_dias_cancelamento_nfse")
    private Integer cofQuantDiasCancelamentoNfse;

    @Size(max = 1)
    @Column(name = "cof_tipo_certidao_socio_parcelada", length = 1)
    private String cofTipoCertidaoSocioParcelada;

    @Size(max = 1)
    @Column(name = "cof_flag_validar_cpf_cnpj", length = 1)
    private String cofFlagValidarCpfCnpj;

    @Size(max = 1)
    @Column(name = "cof_forma_base_calculo_simples", length = 1)
    private String cofFormaBaseCalculoSimples;

    @Size(max = 1)
    @Column(name = "cof_tipo_acrescimo_recobranca", length = 1)
    private String cofTipoAcrescimoRecobranca;

    @Size(max = 1)
    @Column(name = "cof_gerar_dam_fora_exercicio", length = 1)
    private String cofGerarDamForaExercicio;

    @Size(max = 1)
    @Column(name = "cof_substituir_nfse_contribuinte", length = 1)
    private String cofSubstituirNfseContribuinte;

    @Column(name = "cof_quant_dias_substituicao_nfse")
    private Integer cofQuantDiasSubstituicaoNfse;

    @Size(max = 80)
    @Column(name = "cof_exibir_assinaturas", length = 80)
    private String cofExibirAssinaturas;

    @Size(max = 80)
    @Column(name = "cof_cargo_secretario", length = 80)
    private String cofCargoSecretario;

    @Column(name = "cof_forma_valor_venal", length = Integer.MAX_VALUE)
    private String cofFormaValorVenal;

    @Column(name = "cof_tipo_renovacao_alvara", length = Integer.MAX_VALUE)
    private String cofTipoRenovacaoAlvara;

    @Column(name = "cof_exibir_msg_banese", length = Integer.MAX_VALUE)
    private String cofExibirMsgBanese;

    @Column(name = "cof_convenio_remessa_banese")
    private Integer cofConvenioRemessaBanese;

    @Column(name = "cof_assinatura_responsavel")
    private byte[] cofAssinaturaResponsavel;

    @Column(name = "cof_assinatura_secretario")
    private byte[] cofAssinaturaSecretario;

    @Column(name = "cof_assinatura_sec_certidao")
    private byte[] cofAssinaturaSecCertidao;

    @Size(max = 1)
    @Column(name = "cof_altera_iss_simples_nacional", length = 1)
    private String cofAlteraIssSimplesNacional;

    @Column(name = "cof_flag_imovel_economico", length = Integer.MAX_VALUE)
    private String cofFlagImovelEconomico;

    @Column(name = "cof_dia_gerar_iss_simples")
    private Integer cofDiaGerarIssSimples;

    @Size(max = 1)
    @Column(name = "cof_exibir_nfse_atividade", length = 1)
    private String cofExibirNfseAtividade;

    @Column(name = "cof_quant_dias_venc_itbi")
    private Integer cofQuantDiasVencItbi;

    @Size(max = 200)
    @Column(name = "cof_calculo_tsu", length = 200)
    private String cofCalculoTsu;

    @Column(name = "cof_valor_limite_nf_mei", precision = 12, scale = 2)
    private BigDecimal cofValorLimiteNfMei;

    @Size(max = 1)
    @Column(name = "cof_insc_municipal_sequencia", length = 1)
    private String cofInscMunicipalSequencia;

    @Size(max = 1)
    @Column(name = "cof_flag_rps", length = 1)
    private String cofFlagRps;

    @Size(max = 1)
    @Column(name = "cof_gerar_arrecadacao_iss_simples", length = 1)
    private String cofGerarArrecadacaoIssSimples;

    @Size(max = 1)
    @Column(name = "cof_not_cod_sub_grupo_servico_obrigatorio", length = 1)
    private String cofNotCodSubGrupoServicoObrigatorio;

    @Size(max = 1)
    @Column(name = "cof_gerar_arrecadacao_iss_simples_finalizar", length = 1)
    private String cofGerarArrecadacaoIssSimplesFinalizar;

    @Size(max = 1)
    @Column(name = "cof_tipo_certidao_pendente_em_dia", length = 1)
    private String cofTipoCertidaoPendenteEmDia;

    @Size(max = 1)
    @Column(name = "cof_altera_iss_simples_nacional_danfs", length = 1)
    private String cofAlteraIssSimplesNacionalDanfs;

    @Column(name = "cof_fundamentacao_legal_cda", length = Integer.MAX_VALUE)
    private String cofFundamentacaoLegalCda;

    @Column(name = "cof_base_calculo_cda", length = Integer.MAX_VALUE)
    private String cofBaseCalculoCda;

    @Size(max = 1)
    @Column(name = "cof_permitir_gerar_nfa_eletronica_pf", length = 1)
    private String cofPermitirGerarNfaEletronicaPf;

    @Column(name = "cof_quant_dias_cancelamento_nfa_eletronica")
    private Integer cofQuantDiasCancelamentoNfaEletronica;

    @Column(name = "cof_quant_dias_substituicao_nfa_eletronica")
    private Integer cofQuantDiasSubstituicaoNfaEletronica;

    @Size(max = 1)
    @Column(name = "cof_separar_cda_livro_imovel", length = 1)
    private String cofSepararCdaLivroImovel;

    @Size(max = 80)
    @Column(name = "cof_nome_responsavel_certidao_divida_ativa", length = 80)
    private String cofNomeResponsavelCertidaoDividaAtiva;

    @Column(name = "cof_assinatura_responsavel_certidao_divida_ativa")
    private byte[] cofAssinaturaResponsavelCertidaoDividaAtiva;

    @Size(max = 1)
    @Column(name = "cof_baixar_dam_iss_tomador_prefeitura", length = 1)
    private String cofBaixarDamIssTomadorPrefeitura;

    @Column(name = "cof_token_web_iss_integracao", length = Integer.MAX_VALUE)
    private String cofTokenWebIssIntegracao;

    @Size(max = 200)
    @Column(name = "cof_validade_crc", length = 200)
    private String cofValidadeCrc;

    @Size(max = 1)
    @Column(name = "cof_integrar_junta_comercial", length = 1)
    private String cofIntegrarJuntaComercial;

    @Size(max = 1)
    @Column(name = "cof_transferencia_laudenio", length = 1)
    private String cofTransferenciaLaudenio;

    @Column(name = "cof_codigo_orgao_junta")
    private Integer cofCodigoOrgaoJunta;

    @Column(name = "cof_junta_token_client", length = Integer.MAX_VALUE)
    private String cofJuntaTokenClient;

    @Column(name = "cof_junta_token_server", length = Integer.MAX_VALUE)
    private String cofJuntaTokenServer;

    @Column(name = "cof_junta_token_client_homologacao", length = Integer.MAX_VALUE)
    private String cofJuntaTokenClientHomologacao;

    @Column(name = "cof_junta_token_server_homologacao", length = Integer.MAX_VALUE)
    private String cofJuntaTokenServerHomologacao;

    @Column(name = "cof_valor_limite_nf_mei_caminhoneiro_autonomo", precision = 12)
    private BigDecimal cofValorLimiteNfMeiCaminhoneiroAutonomo;

    @Size(max = 1)
    @Column(name = "cof_contribuinte_cancelar_cobranca_agcertidao", length = 1)
    private String cofContribuinteCancelarCobrancaAgcertidao;

}