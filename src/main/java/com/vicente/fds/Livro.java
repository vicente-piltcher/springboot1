package com.vicente.fds;

public class Livro {
    private int id;
    private String titulo;
    private int ano;
    private String autor;

    public Livro(String titulo, String autor, int id, int ano){
        this.ano = ano;
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getAno(){ return this.ano;}
    public int getId(){return this.id;}
    public String getTitulo(){return this.titulo;}
    public String getAutor(){return this.autor;}
}
