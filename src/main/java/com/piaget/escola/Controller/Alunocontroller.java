package com.piaget.escola.Controller;

import com.piaget.escola.Models.Aluno;
import com.piaget.escola.Service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")

public class Alunocontroller {
    private final AlunoService service;

    public Alunocontroller(AlunoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Aluno> listarAlunos(){
        return service.buscarAluno();
    }

    @PostMapping
    public Aluno criarAluno(@RequestBody Aluno aluno){
        return service.salvarNovoAluno(aluno);
    }
}
