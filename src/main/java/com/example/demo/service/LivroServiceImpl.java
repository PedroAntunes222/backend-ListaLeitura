package com.example.demo.service;

import com.example.demo.entity.Livro;
import com.example.demo.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroServiceImpl implements LivroService {

    @Autowired
    private LivroRepository livroRepository;

    @Override
    public Livro saveLivro(Livro livro){
        return livroRepository.save(livro);
    }

    @Override
    public List<Livro> getAllLivros() {
        return livroRepository.findAll();
    }

}
