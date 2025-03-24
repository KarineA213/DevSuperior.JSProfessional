package com.devsuperior.SProfessional.segundaAula.ORM.demo.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;


    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    private Set<Atividades> atividades;


    public Categoria() {
    }

    public Set<Atividades> getAtividades() {
        return atividades;
    }

    public String getDescricao() {
        return descricao;
    }

    public Long getId() {
        return id;
    }
}
