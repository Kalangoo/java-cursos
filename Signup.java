package br.senai.br.model;

public class Signup {
    private String nome;
    private int senha;
    private String email;

    /*-------------*/

    public Signup(String nome, int senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    /*------------*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
