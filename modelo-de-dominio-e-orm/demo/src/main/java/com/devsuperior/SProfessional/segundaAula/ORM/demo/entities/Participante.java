package com.devsuperior.SProfessional.segundaAula.ORM.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_participante")
public class Participante {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;

    @OneToMany(mappedBy = "participante")
    private Set<Matricula> matriculas = new HashSet<>();



    public Participante() {

    }

    public Participante(String email, Long id, String nome) {
        this.email = email;
        this.id = id;
        this.nome = nome;
    }


    public String getEmail() {
        return email;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMatriculas(Set<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
