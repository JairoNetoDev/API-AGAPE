package com.agape.squad6.model.pessoa;

import com.agape.squad6.model.cliente.Cliente;
import com.agape.squad6.model.usuarioContribuinte.UsuarioContribuinte;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "tb_pes_pessoa", schema = "agtributos", indexes = {
        @Index(name = "Ref49118", columnList = "mun_codigo")
})
public class Pessoa {
    @EmbeddedId
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private PessoaId id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "pes_codigo", referencedColumnName = "pes_codigo", insertable = false, updatable = false),
            @JoinColumn(name = "agc_codigo", referencedColumnName = "agc_codigo", insertable = false, updatable = false)
    })
    private UsuarioContribuinte usuarioContribuinte;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agc_codigo", referencedColumnName = "agc_codigo", insertable = false, updatable = false)
    private Cliente cliente;

    @Size(max = 20)
    @Column(name = "pes_insc_municipal", length = 20)
    private String pesInscMunicipal;

    @Column(name = "pes_dt_inicio_atividade")
    private LocalDate pesDtInicioAtividade;

    @Size(max = 20)
    @Column(name = "pes_insc_estadual", length = 20)
    private String pesInscEstadual;

    @Size(max = 100)
    @Column(name = "pes_nome", length = 100)
    private String pesNome;

    @Size(max = 100)
    @Column(name = "pes_fantasia", length = 100)
    private String pesFantasia;

    @Size(max = 20)
    @Column(name = "pes_rg", length = 20)
    private String pesRg;

    @Size(max = 20)
    @Column(name = "pes_pis", length = 20)
    private String pesPis;

    @Size(max = 1)
    @Column(name = "pes_natureza_juridica", length = 1)
    private String pesNaturezaJuridica;

    @Size(max = 18)
    @Column(name = "pes_cpf_cnpj", length = 18)
    private String pesCpfCnpj;

    @Size(max = 1)
    @Column(name = "pes_estado_civil", length = 1)
    private String pesEstadoCivil;

    @Size(max = 1)
    @Column(name = "pes_sexo", length = 1)
    private String pesSexo;

    @Size(max = 14)
    @Column(name = "pes_telefone", length = 14)
    private String pesTelefone;

    @Size(max = 14)
    @Column(name = "pes_celular", length = 14)
    private String pesCelular;

    @Size(max = 80)
    @Column(name = "pes_email", length = 80)
    private String pesEmail;

    @Column(name = "pes_observacao", length = Integer.MAX_VALUE)
    private String pesObservacao;

    @Size(max = 300)
    @Column(name = "pes_endereco", length = 300)
    private String pesEndereco;

    @Size(max = 200)
    @Column(name = "pes_bairro", length = 200)
    private String pesBairro;

    @Size(max = 300)
    @Column(name = "pes_complemento", length = 300)
    private String pesComplemento;

    @Size(max = 11)
    @Column(name = "pes_numero", length = 11)
    private String pesNumero;

    @Size(max = 10)
    @Column(name = "pes_cep", length = 10)
    private String pesCep;

    @Column(name = "pes_dt_nascimento")
    private LocalDate pesDtNascimento;

    @Size(max = 1)
    @Column(name = "pes_incentivo_fiscal", length = 1)
    private String pesIncentivoFiscal;
}