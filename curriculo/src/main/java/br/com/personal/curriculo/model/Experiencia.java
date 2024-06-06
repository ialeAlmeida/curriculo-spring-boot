package br.com.personal.curriculo.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeExperiencia;
    private String instituicao;
    private String periodoConclusao;
    private String descricao;
    
    public String toString() {
        return String.format("""
                %s - %s
                %s
                %s
                """, instituicao, nomeExperiencia, periodoConclusao, descricao);
    }
}
