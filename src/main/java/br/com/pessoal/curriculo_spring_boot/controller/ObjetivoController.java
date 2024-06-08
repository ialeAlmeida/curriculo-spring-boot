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

import br.com.pessoal.curriculo_spring_boot.model.Objetivo;
import br.com.pessoal.curriculo_spring_boot.service.ObjetivoService;

@RestController
@RequestMapping("/api/objetivos")
public class ObjetivoController {
    
    @Autowired ObjetivoService objetivoService;

    @GetMapping
    public List<Objetivo> getAllObjetivo() {
        return objetivoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Objetivo> getObjetivoById(@PathVariable Long id) {
        Optional<Objetivo> objetivo = objetivoService.findById(id);
        return objetivo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Objetivo createObjetivo(@RequestBody Objetivo objetivo) {
        return objetivoService.save(objetivo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Objetivo> updateObjetivo(@PathVariable Long id, @RequestBody Objetivo objetivoDetails) {
        Optional<Objetivo> objetivo = objetivoService.findById(id);
        if (objetivo.isPresent()) {
            Objetivo updatedObjetivo = objetivo.get();
            updatedObjetivo.setDescricao(objetivoDetails.getDescricao());
            return ResponseEntity.ok(objetivoService.save(updatedObjetivo));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteObjetivo(@PathVariable Long id) {
        objetivoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

