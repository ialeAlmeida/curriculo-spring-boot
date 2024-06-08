package br.com.personal.curriculo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.personal.curriculo.model.Objetivo;

public interface ObjetivoRepository extends JpaRepository<Objetivo, Long>{
    
}
