package br.com.personal.curriculo.model;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Pessoa {

    private String nome;
    private int idade;
    private String cargoAlmejado;
    private String contato;
    private String cidadeEstado;
    private String email;
    private String gitHub;

    public Pessoa(String nome, int idade, String cargoAlmejado, String contato, String cidadeEstado, String email, String gitHub) {
        this.nome = nome;
        this.idade = idade;
        this.cargoAlmejado = cargoAlmejado;
        this.contato = contato;
        this.cidadeEstado = cidadeEstado;
        this.email = email;
        this.gitHub = gitHub;
    }
    
}
