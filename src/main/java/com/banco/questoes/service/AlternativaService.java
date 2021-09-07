package com.banco.questoes.service;

import com.banco.questoes.model.Alternativa;
import com.banco.questoes.repository.AlternativaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlternativaService {

   private AlternativaRepository alternativaRepository;

   @Autowired
    public AlternativaService(AlternativaRepository alternativaRepository) {
        this.alternativaRepository = alternativaRepository;
    }

    public List<Alternativa> listarAlternativas(){
        return alternativaRepository.findAll();
    }

    public Optional<Alternativa> buscarAlternativa(long id) {
        Optional<Alternativa> alternativa = alternativaRepository.findById(id);
        return alternativa;
    }
}
