package com.banco.questoes.service;

import com.banco.questoes.model.Pergunta;
import com.banco.questoes.repository.PerguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PerguntaService {

    private PerguntaRepository perguntaRepository;

    @Autowired
    public PerguntaService(PerguntaRepository perguntaRepository) {
        this.perguntaRepository = perguntaRepository;
    }

    public List<Pergunta> listarQuestoes(){
        return perguntaRepository.findAll();
    }

    public Optional<Pergunta> buscarPergunta(long id) {
        Optional<Pergunta> pergunta = perguntaRepository.findById(id);
        return pergunta;
    }
}
