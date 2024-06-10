    package com.agape.squad6.model.cliente;

    import com.agape.squad6.model.usuarios.Usuario;
    import com.fasterxml.jackson.annotation.JsonIgnore;
    import jakarta.persistence.*;
    import jakarta.validation.constraints.Size;
    import lombok.Getter;
    import lombok.Setter;

    import java.time.LocalDate;
    import java.util.List;

    @Getter
    @Setter
    @Entity
    @Table(name = "tb_agc_agcliente", schema = "agportal", indexes = {
            @Index(name = "Ref1433", columnList = "mun_codigo")
    }, uniqueConstraints = {
            @UniqueConstraint(name = "tb_agc_agcliente_agc_chave_integracao_terceiro_key", columnNames = {"agc_chave_integracao_terceiro"})
    })
    public class Cliente {
        @Id
        @Column(name = "agc_codigo", nullable = false)
        private Integer id;

        @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
        @JsonIgnore
        private List<Usuario> usuario;

        @Size(max = 10)
        @Column(name = "agc_tratamento", length = 10)
        private String agcTratamento;

        @Size(max = 200)
        @Column(name = "agc_nome", length = 200)
        private String agcNome;

        @Size(max = 60)
        @Column(name = "agc_alias", length = 60)
        private String agcAlias;

        @Column(name = "agc_foto")
        private byte[] agcFoto;

        @Column(name = "agc_dt_nascimento")
        private LocalDate agcDtNascimento;

        @Column(name = "agc_membro_desde")
        private LocalDate agcMembroDesde;

        @Size(max = 1)
        @Column(name = "agc_sexo", length = 1)
        private String agcSexo;

        @Size(max = 1)
        @Column(name = "agc_estado_civil", length = 1)
        private String agcEstadoCivil;

        @Size(max = 60)
        @Column(name = "agc_logradouro", length = 60)
        private String agcLogradouro;

        @Size(max = 18)
        @Column(name = "agc_numero", length = 18)
        private String agcNumero;

        @Size(max = 80)
        @Column(name = "agc_complemento", length = 80)
        private String agcComplemento;

        @Size(max = 30)
        @Column(name = "agc_bairro", length = 30)
        private String agcBairro;

        @Size(max = 10)
        @Column(name = "agc_cep", length = 10)
        private String agcCep;

        @Size(max = 14)
        @Column(name = "agc_tel1", length = 14)
        private String agcTel1;

        @Size(max = 14)
        @Column(name = "agc_tel2", length = 14)
        private String agcTel2;

        @Size(max = 14)
        @Column(name = "agc_fax", length = 14)
        private String agcFax;

        @Size(max = 20)
        @Column(name = "agc_rg", length = 20)
        private String agcRg;

        @Size(max = 18)
        @Column(name = "agc_cnpj", length = 18)
        private String agcCnpj;

        @Size(max = 18)
        @Column(name = "agc_ie", length = 18)
        private String agcIe;

        @Size(max = 200)
        @Column(name = "agc_razao_social", length = 200)
        private String agcRazaoSocial;

        @Size(max = 60)
        @Column(name = "agc_site", length = 60)
        private String agcSite;

        @Size(max = 80)
        @Column(name = "agc_contato", length = 80)
        private String agcContato;

        @Size(max = 30)
        @Column(name = "agc_cargo", length = 30)
        private String agcCargo;

        @Size(max = 14)
        @Column(name = "agc_celular", length = 14)
        private String agcCelular;

        @Size(max = 80)
        @Column(name = "agc_mail", length = 80)
        private String agcMail;

        @Size(max = 1)
        @Column(name = "agc_situacao", length = 1)
        private String agcSituacao;

        @Size(max = 32)
        @Column(name = "agc_md5", length = 32)
        private String agcMd5;

        @Size(max = 100)
        @Column(name = "agc_param_servidor_contracheque", length = 100)
        private String agcParamServidorContracheque;

        @Column(name = "agc_param_caminho_bd_contracheque", length = Integer.MAX_VALUE)
        private String agcParamCaminhoBdContracheque;

        @Size(max = 100)
        @Column(name = "agc_param_email_rh_contracheque", length = 100)
        private String agcParamEmailRhContracheque;

        @Size(max = 100)
        @Column(name = "agc_param_servidor_contracheque_sec", length = 100)
        private String agcParamServidorContrachequeSec;

        @Column(name = "agc_param_caminho_bd_contracheque_sec", length = Integer.MAX_VALUE)
        private String agcParamCaminhoBdContrachequeSec;

        @Column(name = "agc_cabecalho")
        private byte[] agcCabecalho;

        @Column(name = "agc_rodape")
        private byte[] agcRodape;

        @Size(max = 18)
        @Column(name = "agc_insc_municipal", length = 18)
        private String agcInscMunicipal;

        @Size(max = 1)
        @Column(name = "agc_param_cad_auto_contracheque", length = 1)
        private String agcParamCadAutoContracheque;

        @Size(max = 1)
        @Column(name = "agc_exibir_margem_contracheque", length = 1)
        private String agcExibirMargemContracheque;

        @Size(max = 100)
        @Column(name = "agc_usuario_mail", length = 100)
        private String agcUsuarioMail;

        @Size(max = 100)
        @Column(name = "agc_senha_mail", length = 100)
        private String agcSenhaMail;

        @Size(max = 200)
        @Column(name = "agc_servidor_mail", length = 200)
        private String agcServidorMail;

        @Column(name = "agc_porta_mail")
        private Integer agcPortaMail;

        @Column(name = "agc_contracheque_web", length = Integer.MAX_VALUE)
        private String agcContrachequeWeb;

        @Size(max = 1)
        @Column(name = "agc_responde_enquete", length = 1)
        private String agcRespondeEnquete;

        @Column(name = "agc_param_quant_meses_transparencia")
        private Integer agcParamQuantMesesTransparencia;

        @Size(max = 1)
        @Column(name = "agc_simulacao", length = 1)
        private String agcSimulacao;

        @Size(max = 1)
        @Column(name = "agc_detalhe_transparencia", length = 1)
        private String agcDetalheTransparencia;

        @Size(max = 1)
        @Column(name = "agc_somente_efetivo_transparencia", length = 1)
        private String agcSomenteEfetivoTransparencia;

        @Column(name = "agc_exibir_salario_base", length = Integer.MAX_VALUE)
        private String agcExibirSalarioBase;

        @Column(name = "agc_exibir_remuneracao_bruta", length = Integer.MAX_VALUE)
        private String agcExibirRemuneracaoBruta;

        @Column(name = "agc_exibir_desconto_obrigatorio", length = Integer.MAX_VALUE)
        private String agcExibirDescontoObrigatorio;

        @Column(name = "agc_exibir_valor_liquido_legal", length = Integer.MAX_VALUE)
        private String agcExibirValorLiquidoLegal;

        @Column(name = "agc_cpf_quant_caracter_visivel")
        private Integer agcCpfQuantCaracterVisivel;

        @Size(max = 4000)
        @Column(name = "agc_obs_transparencia", length = 4000)
        private String agcObsTransparencia;

        @Column(name = "agc_param_ano_inicio_contracheque")
        private Integer agcParamAnoInicioContracheque;

        @Column(name = "agc_somente_folha_mensal_transparencia", length = Integer.MAX_VALUE)
        private String agcSomenteFolhaMensalTransparencia;

        @Column(name = "agc_filtrar_departamento_sagres", length = Integer.MAX_VALUE)
        private String agcFiltrarDepartamentoSagres;

        @Column(name = "agc_param_somente_pagos_transparencia", length = Integer.MAX_VALUE)
        private String agcParamSomentePagosTransparencia;

        @Column(name = "agc_param_outros_descontos_transparencia", length = Integer.MAX_VALUE)
        private String agcParamOutrosDescontosTransparencia;

        @Size(max = 200)
        @Column(name = "agc_orgao_diario_oficial", length = 200)
        private String agcOrgaoDiarioOficial;

        @Size(max = 100)
        @Column(name = "agc_param_servidor_conversao", length = 100)
        private String agcParamServidorConversao;

        @Column(name = "agc_param_caminho_bd_conversao", length = Integer.MAX_VALUE)
        private String agcParamCaminhoBdConversao;

        @Column(name = "agc_usar_perfil_padrao")
        private Boolean agcUsarPerfilPadrao;

        @Column(name = "agc_qtd_assinatura_mensal")
        private Integer agcQtdAssinaturaMensal;

        @Size(max = 1)
        @Column(name = "agc_poder", length = 1)
        private String agcPoder;

        @Size(max = 4)
        @Column(name = "clt_codigo", length = 4)
        private String cltCodigo;

        @Size(max = 5)
        @Column(name = "naj_codigo", length = 5)
        private String najCodigo;

        @Column(name = "agc_dt_ato_criacao")
        private LocalDate agcDtAtoCriacao;

        @Size(max = 32)
        @Column(name = "agc_ato_criacao", length = 32)
        private String agcAtoCriacao;

        @Column(name = "agc_veiculo_pub_ato_criacao")
        private Integer agcVeiculoPubAtoCriacao;

        @Column(name = "org_codigo")
        private Integer orgCodigo;

        @Column(name = "agc_chave_integracao_terceiro", length = Integer.MAX_VALUE)
        private String agcChaveIntegracaoTerceiro;

        @Size(max = 1)
        @Column(name = "agc_principal", length = 1)
        private String agcPrincipal;

    }