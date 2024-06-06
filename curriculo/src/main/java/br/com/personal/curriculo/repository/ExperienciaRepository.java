package br.com.personal.curriculo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.personal.curriculo.model.Experiencia;

public interface ExperienciaRepository extends JpaRepository<Experiencia, Long>{
    
}
