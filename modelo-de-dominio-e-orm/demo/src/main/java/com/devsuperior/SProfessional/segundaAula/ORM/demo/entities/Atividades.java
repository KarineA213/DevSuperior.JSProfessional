package com.devsuperior.SProfessional.segundaAula.ORM.demo.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_atividades")
public class Atividades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private Double preco;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    @OneToMany(mappedBy = "atividade")
    private Set<Matricula> matriculas = new HashSet<>();

    @ManyToOne
    private Bloco blocos;

    public Atividades() {
    }

    public Atividades(Bloco blocos, Categoria categoria, String descricao, Long id, Set<Matricula> matriculas, String nome, Double preco) {
        this.blocos = blocos;
        this.categoria = categoria;
        this.descricao = descricao;
        this.id = id;
        this.matriculas = matriculas;
        this.nome = nome;
        this.preco = preco;
    }

    public Bloco getBlocos() {
        return blocos;
    }

    public void setBlocos(Bloco blocos) {
        this.blocos = blocos;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(Set<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }



}

