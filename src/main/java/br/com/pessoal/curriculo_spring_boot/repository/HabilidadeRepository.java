package br.com.personal.curriculo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.personal.curriculo.model.Habilidade;

public interface HabilidadeRepository extends JpaRepository<Habilidade, Long>{
    
}
