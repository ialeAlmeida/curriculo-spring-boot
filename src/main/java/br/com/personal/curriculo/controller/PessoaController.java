package br.com.personal.curriculo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.personal.curriculo.model.Pessoa;
import br.com.personal.curriculo.servuce.PessoaService;


@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {

    @Autowired PessoaService pessoaService;

    @GetMapping
    public List<Pessoa> getAllPessoas() {
        return pessoaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> getPessoaById(@PathVariable Long id) {
        Optional<Pessoa> pessoa = pessoaService.findById(id);
        return pessoa.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Pessoa createPesssoa(@RequestBody Pessoa pessoa) {
        return pessoaService.save(pessoa);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pessoa> updatePessoa(@PathVariable Long id, @RequestBody Pessoa pessoaDetails) {
        Optional<Pessoa> pessoaOptional = pessoaService.findById(id);
        if (pessoaOptional.isPresent()) {
            Pessoa updatedPessoa = pessoa.get();
            updatedPessoa.setNome(pessoaDetails.getNome());
            updatedPessoa.setIdade(pessoaDetails.getIdade());
            updatedPessoa.setCargoAlmejado(pessoaDetails.getCargoAlmejado());
            updatedPessoa.setContato(pessoaDetails.getContato());
            updatedPessoa.setCidadeEstado(pessoaDetails.getCidadeEstado());
            updatedPessoa.setEmail(pessoaDetails.getEmail());
            updatedPessoa.setGitHub(pessoaDetails.getGitHub());
            return ResponseEntity.ok(policialService.save(updatedPessoa));
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