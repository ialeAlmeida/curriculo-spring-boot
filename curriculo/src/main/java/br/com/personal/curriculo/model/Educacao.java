package br.com.personal.curriculo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Educacao {
    
    private String nomeCurso;
    private String tipoEducacao;
    private String instituicao;
    private int anoConclusao;

    @Override
    public String toString() {
        return String.format("""
                %s - %s
                %d - %s
        """, tipoEducacao, nomeCurso, anoConclusao, instituicao);
    }
}
