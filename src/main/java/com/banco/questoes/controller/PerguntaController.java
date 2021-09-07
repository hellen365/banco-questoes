package com.banco.questoes.controller;

import com.banco.questoes.model.Pergunta;
import com.banco.questoes.service.PerguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pergunta")
public class PerguntaController {

    private PerguntaService perguntaService;

    @Autowired
    public PerguntaController(PerguntaService perguntaService) {
        this.perguntaService = perguntaService;
    }

    @GetMapping("/perguntas")
    public ResponseEntity<List<Pergunta>> listaQuestoes(){
        return ResponseEntity.ok().body(perguntaService.listarQuestoes());
    }

    @GetMapping(value = "/pergunta/{id}")
    public ResponseEntity<Optional<Pergunta>> buscarPerguntaUnica(@PathVariable(value = "id") long id){
        Optional<Pergunta> pergunta  = perguntaService.buscarPergunta(id);
        return ResponseEntity.ok().body(pergunta);
    }
}
