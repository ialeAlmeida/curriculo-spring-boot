package br.com.personal.curriculo.model;

import java.util.ArrayList;
import java.util.List;

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

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getCargoAlmejado() {
        return cargoAlmejado;
    }
    public String getContato() {
        return contato;
    }
    public String getCidadeEstado() {
        return cidadeEstado;
    }
    public String getEmail() {
        return email;
    }
    public String getGitHub() {
        return gitHub;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setCargoAlmejado(String cargoAlmejado) {
        this.cargoAlmejado = cargoAlmejado;
    }
    public void setContato(String contato) {
        this.contato = contato;
    }
    public void setCidadeEstado(String cidadeEstado) {
        this.cidadeEstado = cidadeEstado;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setGitHub(String gitHub) {
        this.gitHub = gitHub;
    }
}
