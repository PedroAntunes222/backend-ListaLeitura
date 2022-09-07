package com.example.demo.service;

import com.example.demo.entity.Livro;

import java.util.List;

public interface LivroService {
    public Livro saveLivro(Livro livro);
    public List<Livro> getAllLivros();
}
