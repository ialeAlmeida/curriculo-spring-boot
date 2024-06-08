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

import br.com.pessoal.curriculo_spring_boot.model.Habilidade;
import br.com.pessoal.curriculo_spring_boot.service.HabilidadeService;

@RestController
@RequestMapping("/api/habilidades")
public class HabilidadeController {
    @Autowired HabilidadeService habilidadeService;

    @GetMapping
    public List<Habilidade> getAllHabilidades() {
        return habilidadeService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Habilidade> getObjetivoById(@PathVariable Long id) {
        Optional<Habilidade> habilidadeOptional = habilidadeService.findById(id);
        return habilidadeOptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Habilidade createHabilidade(@RequestBody Habilidade habilidade) {
        return habilidadeService.save(habilidade);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Habilidade> updateObjetivo(@PathVariable Long id, @RequestBody Habilidade habilidadeDetails) {
        Optional<Habilidade> habilidadeOptional = habilidadeService.findById(id);
        if (habilidadeOptional.isPresent()) {
            Habilidade updatedHabilidade = habilidadeOptional.get();
            updatedHabilidade.setNome(habilidadeDetails.getNome());
            return ResponseEntity.ok(habilidadeService.save(updatedHabilidade));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHabilidade(@PathVariable Long id) {
        habilidadeService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}