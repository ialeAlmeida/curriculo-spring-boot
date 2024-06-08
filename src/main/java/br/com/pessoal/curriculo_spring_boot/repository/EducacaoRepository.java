package br.com.pessoal.curriculo_spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pessoal.curriculo_spring_boot.model.Educacao;

public interface EducacaoRepository extends JpaRepository<Educacao, Long>{
    
}
