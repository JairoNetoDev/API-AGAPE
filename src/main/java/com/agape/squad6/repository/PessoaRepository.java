package com.agape.squad6.repository;

import com.agape.squad6.model.pessoa.Pessoa;
import com.agape.squad6.model.pessoa.PessoaId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, PessoaId> {
     Pessoa findByPesCpfCnpj(String cpfCnpj);

}
