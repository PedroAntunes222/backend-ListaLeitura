package com.example.demo.controller;


import com.example.demo.entity.Livro;
import com.example.demo.repository.LivroRepository;
import com.example.demo.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livro")
@CrossOrigin
public class LivroController {

    @Autowired
    private LivroService livroService;

    @PostMapping("/add")
    public String add(@RequestBody Livro livro){
        livroService.saveLivro(livro);
        return "novo livro adicionado";
    }

    @GetMapping("/getAll")
    public List<Livro> list(){
        return livroService.getAllLivros();
    }

}
