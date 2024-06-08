package br.com.pessoal.curriculo_spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pessoal.curriculo_spring_boot.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
    
}
