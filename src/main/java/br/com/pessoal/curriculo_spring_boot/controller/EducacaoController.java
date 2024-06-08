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

import br.com.pessoal.curriculo_spring_boot.model.Educacao;
import br.com.pessoal.curriculo_spring_boot.service.EducacaoService;

@RestController
@RequestMapping("/api/educacoes")
public class EducacaoController {
    
    @Autowired EducacaoService educacaoService;

    @GetMapping
    public List<Educacao> getAllEducacao() {
        return educacaoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Educacao> getEducacaoById(@PathVariable Long id) {
        Optional<Educacao> educacao = educacaoService.findById(id);
        return educacao.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Educacao createEducacao(@RequestBody Educacao educacao) {
        return educacaoService.save(educacao);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Educacao> updateEducacao(@PathVariable Long id, @RequestBody Educacao educacaoDetails) {
        Optional<Educacao> educacao = educacaoService.findById(id);
        if (educacao.isPresent()) {
            Educacao updatedEducacao = educacao.get();
            updatedEducacao.setNomeCurso(educacaoDetails.getNomeCurso());
            updatedEducacao.setTipoEducacao(educacaoDetails.getTipoEducacao());
            updatedEducacao.setInstituicao(educacaoDetails.getInstituicao());
            updatedEducacao.setAnoConclusao(educacaoDetails.getAnoConclusao());
            return ResponseEntity.ok(educacaoService.save(updatedEducacao));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEducacao(@PathVariable Long id) {
        educacaoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }    
}
