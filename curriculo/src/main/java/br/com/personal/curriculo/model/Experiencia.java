package br.com.personal.curriculo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Experiencia {
    
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
