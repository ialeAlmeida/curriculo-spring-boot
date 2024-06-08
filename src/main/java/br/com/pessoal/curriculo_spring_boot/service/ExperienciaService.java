package br.com.pessoal.curriculo_spring_boot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pessoal.curriculo_spring_boot.repository.ExperienciaRepository;
import br.com.pessoal.curriculo_spring_boot.model.Experiencia;

@Service
public class ExperienciaService {
    
    @Autowired ExperienciaRepository experienciaRepository;

    public List<Experiencia> findAll() {
        return experienciaRepository.findAll();
    }

    public Optional<Experiencia> findById(Long id) {
        return experienciaRepository.findById(id);
    }

    public Experiencia save(Experiencia experiencia) {
        return experienciaRepository.save(experiencia);
    } 

    public void deleteById(Long id) {
        experienciaRepository.deleteById(id);
    }

    public boolean existsById(Long id) {
        return experienciaRepository.existsById(id);
    }

}
