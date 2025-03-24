package com.devsuperior.SProfessional.segundaAula.ORM.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "TB_MATRICULA")

public class Matricula {

     //embeddable n podem ter id

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_participante")
    private Participante participante;

    @ManyToOne
    @JoinColumn(name = "id_atividade")
    private Atividades atividade;

    @ManyToOne
    @JoinColumn(name = "id_bloco")
    private Bloco bloco;

    public Matricula() {
    }


    public Matricula(Atividades atividade, Bloco bloco, Long id, Participante participante) {
        this.atividade = atividade;
        this.bloco = bloco;
        this.id = id;
        this.participante = participante;
    }

    public Atividades getAtividade() {
        return atividade;
    }

    public Bloco getBloco() {
        return bloco;
    }

    public Long getId() {
        return id;
    }

    public Participante getParticipante() {
        return participante;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Matricula matricula = (Matricula) o;
        if (!atividade.equals(matricula.atividade)) return false;
        if (!bloco.equals(matricula.bloco)) return false;
        return participante.equals(matricula.participante);
    }

    @Override
    public int hashCode() {
        int result = atividade.hashCode();
        result = 31 * result + bloco.hashCode();
        result = 31 * result + participante.hashCode();
        return result;
    }



}