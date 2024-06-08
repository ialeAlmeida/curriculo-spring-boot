package br.com.personal.curriculo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.personal.curriculo.repository.HabilidadeRepository;
import br.com.personal.curriculo.model.Habilidade;

@Service
public class HabilidadeService {
    
    @Autowired HabilidadeRepository habilidadeRepository;

    public List<Habilidade> findAll() {
        return habilidadeRepository.findAll();
    }

    public Optional<Habilidade> findById(Long id) {
        return habilidadeRepository.findById(id);
    }

    public Habilidade save(Habilidade habilidade) {
        return habilidadeRepository.save(habilidade);
    } 

    public void deleteById(Long id) {
        habilidadeRepository.deleteById(id);
    }

    public boolean existsById(Long id) {
        return habilidadeRepository.existsById(id);
    }
}
