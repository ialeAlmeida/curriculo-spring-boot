package br.com.personal.curriculo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.personal.curriculo.model.Educacao;

public interface EducacaoRepository extends JpaRepository<Educacao, Long>{
    
}
