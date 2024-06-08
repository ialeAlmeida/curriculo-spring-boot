package br.com.pessoal.curriculo_spring_boot.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Educacao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nomeCurso;
    
    private String tipoEducacao;
    
    private String instituicao;
    
    private int anoConclusao;

    @ManyToOne
    @JoinColumn(name = "id")
    private Pessoa pessoa;

    @Override
    public String toString() {
        return String.format("""
                %s - %s
                %d - %s
        """, tipoEducacao, nomeCurso, anoConclusao, instituicao);
    }
}
