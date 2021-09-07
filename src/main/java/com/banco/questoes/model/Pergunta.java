package com.banco.questoes.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Pergunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String titulo;

    private String tipo;

    private int resposta;

    @JsonIgnore
    @OneToMany(mappedBy="pergunta")
    private List<Alternativa> alternativas;

}
