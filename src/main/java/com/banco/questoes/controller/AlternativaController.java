package com.banco.questoes.controller;

import com.banco.questoes.model.Alternativa;
import com.banco.questoes.service.AlternativaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alternativa")
public class AlternativaController {

    private AlternativaService alternativaService;

    @Autowired
    public AlternativaController(AlternativaService alternativaService) {
        this.alternativaService = alternativaService;
    }

    @GetMapping("/alternativas")
    public ResponseEntity<List<Alternativa>> listarAlternativas(){
        return ResponseEntity.ok().body(alternativaService.listarAlternativas());
    }

    @GetMapping(value = "/alternativa/{id}")
    public ResponseEntity<Optional<Alternativa>> buscarAlternativaUnica(@PathVariable(value = "id") long id){
        Optional<Alternativa> pergunta  = alternativaService.buscarAlternativa(id);
        return ResponseEntity.ok().body(pergunta);
    }
}
