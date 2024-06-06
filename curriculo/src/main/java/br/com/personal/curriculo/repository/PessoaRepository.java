package br.com.personal.curriculo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.personal.curriculo.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
    
}
