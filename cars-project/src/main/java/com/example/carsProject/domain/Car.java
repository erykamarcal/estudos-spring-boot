package com.example.carsProject.domain;

public class Cars {
    private long id;
    private String nome;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cars(long id, String nome) {

        this.id = id;
        this.nome = nome;
    }
}
