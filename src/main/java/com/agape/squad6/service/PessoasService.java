package com.agape.squad6.service;

import com.agape.squad6.dto.PessoaDetails;
import com.agape.squad6.dto.PessoaResponseDTO;
import com.agape.squad6.model.pessoa.Pessoa;
import com.agape.squad6.model.pessoa.exceptions.PessoaNotFoundException;
import com.agape.squad6.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PessoasService {

    private final PessoaRepository pessoaRepository;

    public PessoaResponseDTO findByPesCpfCnpj(String cpfCnpj) {
        Optional<Pessoa> optionalPessoa = Optional.ofNullable(pessoaRepository.findByPesCpfCnpj(cpfCnpj));

        Pessoa pessoa = optionalPessoa.orElseThrow(() -> new PessoaNotFoundException("Pessoa não encontrada com CPF/CNPJ: " + cpfCnpj));

        PessoaDetails pessoaDetails = new PessoaDetails(
                pessoa.getId().getPesCodigo(),
                pessoa.getId().getAgcCodigo(),
                pessoa.getPesNome(),
                pessoa.getPesFantasia(),
                pessoa.getPesRg(),
                pessoa.getPesCpfCnpj(),
                pessoa.getPesSexo(),
                pessoa.getPesTelefone(),
                pessoa.getPesCelular(),
                pessoa.getPesEmail(),
                pessoa.getPesEndereco(),
                pessoa.getPesBairro(),
                pessoa.getPesComplemento(),
                pessoa.getPesNumero(),
                pessoa.getPesCep()
        );

        return new PessoaResponseDTO(pessoaDetails);
    }

}

