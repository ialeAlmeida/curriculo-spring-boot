package br.com.personal.curriculo.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name="pessoas")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    
    private int idade;
    
    private String cargoAlmejado;
    
    private String contato;
    
    private String cidadeEstado;
    
    private String email;
    
    private String gitHub;
    
    @OneToMany(mappedBy = "educacao")
    private List<Educacao> educacoes = new ArrayList<Educacao>();

    @OneToMany(mappedBy = "experiencia")
    private List<Experiencia> experiencias = new ArrayList<Experiencia>();
    
    @OneToMany(mappedBy = "habilidade")
    private List<Habilidade> habilidades = new ArrayList<Habilidade>();

    @OneToMany(mappedBy = "objetivo")
    private List<Objetivo> objetivos = new ArrayList<Objetivo>();


    public Pessoa(String nome, int idade, String cargoAlmejado, String contato, String cidadeEstado, String email, String gitHub) {
        this.nome = nome;
        this.idade = idade;
        this.cargoAlmejado = cargoAlmejado;
        this.contato = contato;
        this.cidadeEstado = cidadeEstado;
        this.email = email;
        this.gitHub = gitHub;
        this.educacoes = ArrayList<Educacao> educacoes;
        this.experiencias = ArrayList<Experiencia> experiencias;
        this.habilidades = ArrayList<Habilidade> habilidades;
        this.objetivos = ArrayList<Objetivo> objetivos;
    }
    
}
