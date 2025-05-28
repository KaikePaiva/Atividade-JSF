package br.com.cadUser;

public class Pessoa {
    private String nome;
    
    // Construtores
    public Pessoa() {
    }
    
    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // Método toString para exibição
    @Override
    public String toString() {
        return nome;
    }
}