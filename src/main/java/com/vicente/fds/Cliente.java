package com.vicente.fds;

public class Cliente {
    private int id;
    private String nome;
    private int ano;

    public Cliente(int id, String nome, int ano){
        this.id = id;
        this.nome = nome;
        this.ano = ano;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.nome;
    }

    public int getAno(){
        return this.ano;
    }
}
