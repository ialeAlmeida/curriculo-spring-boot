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

import br.com.pessoal.curriculo_spring_boot.model.Experiencia;
import br.com.pessoal.curriculo_spring_boot.service.ExperienciaService;

@RestController
@RequestMapping("/api/experiencias")
public class ExperienciaController {
    
    @Autowired ExperienciaService experienciaService;

    @GetMapping
    public List<Experiencia> getAllExperiencias() {
        return experienciaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Experiencia> getExperienciaById(@PathVariable Long id) {
        Optional<Experiencia> experiencia = experienciaService.findById(id);
        return experiencia.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Experiencia createExperiencia(@RequestBody Experiencia experiencia) {
        return experienciaService.save(experiencia);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Experiencia> updateExperiencia(@PathVariable Long id, @RequestBody Experiencia experiencia) {
        Optional<Experiencia> experienciaOptional = experienciaService.findById(id);
        if (experienciaOptional.isPresent()) {
            Experiencia updatedExperiencia = experienciaOptional.get();
            updatedExperiencia.setNomeExperiencia(experiencia.getNomeExperiencia());
            updatedExperiencia.setInstituicao(experiencia.getInstituicao());
            updatedExperiencia.setPeriodoConclusao(experiencia.getPeriodoConclusao());
            updatedExperiencia.setDescricao(experiencia.getDescricao());
            return ResponseEntity.ok(experienciaService.save(updatedExperiencia));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExperiencia(@PathVariable Long id) {
        experienciaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }    
}