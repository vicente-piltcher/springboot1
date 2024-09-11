package com.vicente.fds;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/biblioteca")
public class Controller {

    private List<Livro> livros;

    public Controller() {
        livros = new ArrayList<>();

        livros.add(new Livro("ABC", "Vicente", 1, 2024));
        livros.add(new Livro("ABC", "Marcela", 5, 2024));
        livros.add(new Livro("DEF", "Vicente", 2, 2024));
        livros.add(new Livro("GHI", "Marcela", 3, 2024));
        livros.add(new Livro("JKL", "Andrei", 4, 2024));
    }

    @GetMapping
    public String mundo(){
        return "Olá Mundo!";
    }

    @GetMapping("/store")
    public List<Livro> store(){
        return this.livros;
    }

    @GetMapping("/autores")
    public List<String> autores(){
        return livros
                .stream()
                .map(Livro::getAutor)
                .distinct()
                .toList();
    }

    @GetMapping("/livros")
    public List<String> livros(){
        return livros
                .stream()
                .map(Livro::getTitulo)
                .toList();
    }

    @GetMapping("/livro/{titulo}")
    public List<Livro> livrotitulo(@PathVariable String titulo){
        return livros.stream().filter(l -> l.getTitulo().equals(titulo)).toList();
    }

    @PostMapping("/livro/newBook")
    public boolean postNewBook(@RequestBody final Livro l){
        return livros.add(l);
    }
    
}
