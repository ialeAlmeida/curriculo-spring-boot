package br.com.pessoal.curriculo_spring_boot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pessoal.curriculo_spring_boot.repository.ObjetivoRepository;
import br.com.pessoal.curriculo_spring_boot.model.Objetivo;

@Service
public class ObjetivoService {
    
    @Autowired ObjetivoRepository objetivoRepository;

    public List<Objetivo> findAll() {
        return objetivoRepository.findAll();
    }

    public Optional<Objetivo> findById(Long id) {
        return objetivoRepository.findById(id);
    }

    public Objetivo save(Objetivo objetivo) {
        return objetivoRepository.save(objetivo);
    } 

    public void deleteById(Long id) {
        objetivoRepository.deleteById(id);
    }

    public boolean existsById(Long id) {
        return objetivoRepository.existsById(id);
    }
}
