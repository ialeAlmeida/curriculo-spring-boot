package br.com.pessoal.curriculo_spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pessoal.curriculo_spring_boot.model.Experiencia;

public interface ExperienciaRepository extends JpaRepository<Experiencia, Long>{
    
}
