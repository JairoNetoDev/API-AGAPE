//package com.agape.squad6.service;
//
//import com.agape.squad6.DamData;
//import com.agape.squad6.model.arrecadacoes.Arrecadacao;
//import com.agape.squad6.repository.ArrecadacaoRepository;
//import lombok.RequiredArgsConstructor;
//import net.sf.jasperreports.engine.JRException;
//import org.springframework.stereotype.Service;
//
//import java.util.Collections;
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class ImpressoesService {
//    private final ArrecadacaoRepository arrecadacaoRepository;
//
//    public byte[] gerarDAM(Integer agcCodigo, Integer ano, Integer codigoTributo, Integer codigoPessoa) throws JRException {
//        // Buscar os dados de arrecadação do banco de dados
//        Arrecadacao arrecadacao = arrecadacaoRepository.findByIdAgcCodigoAndIdExeAnoAndTributoIdTriCodigoAndPessoaIdPesCodigo(
//                agcCodigo, ano, codigoTributo, codigoPessoa);
//
//        if (arrecadacao == null) {
//            throw new RuntimeException("Arrecadação não encontrada");
//        }
//
//        List<DamData> damDataList = Collections.singletonList(
//                new DamData(
//                        arrecadacao.getPessoa().getPesNome(),
//                        arrecadacao.getPessoa().getPesEndereco(),
//                        arrecadacao.getPessoa().getPesCpfCnpj(),
//                        arrecadacao.getTributo().getTriDescricao(),
//                        arrecadacao.getArrAliquota(),
//                        arrecadacao.getArrValorMulta(),
//                        arrecadacao.getArrValorTotal(),
//                        arrecadacao.getArrDtVencimento(),
//                        arrecadacao.getArrDtPagamento(),
//                        arrecadacao.getArrDtEmissao()
//                )
//        );
//        return new byte[0];
//    }
//}
