package org.example.controller;


import org.example.entity.Aluno;
import org.example.entity.form.AlunoForm;
import org.example.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service; //injetar service

    @GetMapping
    public List<Aluno> getAll(){
        return service.getAll();
    }

    @PostMapping
    public Aluno create(@RequestBody AlunoForm form){
        return service.create(form);
    }


}
