package br.com.pessoal.curriculo_spring_boot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pessoal.curriculo_spring_boot.repository.PessoaRepository;
import br.com.pessoal.curriculo_spring_boot.model.Pessoa;

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