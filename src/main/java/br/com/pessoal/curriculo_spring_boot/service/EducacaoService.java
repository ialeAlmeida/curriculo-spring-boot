package br.com.personal.curriculo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.personal.curriculo.repository.EducacaoRepository;
import br.com.personal.curriculo.model.Educacao;

@Service
public class EducacaoService {
    
    @Autowired EducacaoRepository educacaoRepository;

    public List<Educacao> findAll() {
        return educacaoRepository.findAll();
    }

    public Optional<Educacao> findById(Long id) {
        return educacaoRepository.findById(id);
    }

    public Educacao save(Educacao educacao) {
        return educacaoRepository.save(educacao);
    } 

    public void deleteById(Long id) {
        educacaoRepository.deleteById(id);
    }

    public boolean existsById(Long id) {
        return educacaoRepository.existsById(id);
    }

}
