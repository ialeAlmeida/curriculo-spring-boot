package br.com.pessoal.curriculo_spring_boot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pessoal.curriculo_spring_boot.model.Pessoa;
import br.com.pessoal.curriculo_spring_boot.service.PessoaService;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {
    
    @Autowired PessoaService pessoaService;

    @GetMapping
    public List<Pessoa> getAllPessoas() {
        return pessoaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> getPolicialById(@PathVariable Long id) {
        Optional<Pessoa> pessoa = pessoaService.findById(id);
        return pessoa.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Pessoa createPessoa(@RequestBody Pessoa pessoa) {
        return pessoaService.save(pessoa);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pessoa> updatePessoa(@PathVariable Long id, @RequestBody Pessoa pessoaDetails) {
        Optional<Pessoa> pessoa = pessoaService.findById(id);
        if (pessoa.isPresent()) {
            Pessoa updatedPessoa = pessoa.get();
            updatedPessoa.setNome(pessoaDetails.getNome());
            updatedPessoa.setIdade(pessoaDetails.getIdade());
            updatedPessoa.setCargoAlmejado(pessoaDetails.getCargoAlmejado());
            updatedPessoa.setContato(pessoaDetails.getContato());
            updatedPessoa.setCidadeEstado(pessoaDetails.getCidadeEstado());
            updatedPessoa.setEmail(pessoaDetails.getEmail());
            return ResponseEntity.ok(pessoaService.save(updatedPessoa));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePessoa(@PathVariable Long id) {
        pessoaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

