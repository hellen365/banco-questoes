package com.banco.questoes.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Alternativa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String alternativa;

    @ManyToOne
    @JoinColumn(name="questao_id", nullable=false)
    private Pergunta pergunta;

}
