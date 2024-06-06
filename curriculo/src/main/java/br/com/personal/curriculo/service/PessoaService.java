package br.com.personal.curriculo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.personal.curriculo.repository.PessoaRepository;
import br.com.personal.curriculo.model.Pessoa;

@Service
public class PessoaService {
    
    @Autowired PessoaRepository pessoaRepository;

    public List<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }

    public Optional<Pessoa> findById(Long id) {
        return pessoaRepository.findById(id);
    }

    public Pessoa save(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    } 

    public void deleteById(Long id) {
        pessoaRepository.deleteById(id);
    }

    public boolean existsById(Long id) {
        return pessoaRepository.existsById(id);
    }

}