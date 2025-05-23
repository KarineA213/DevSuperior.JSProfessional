package com.devsuperior.crud.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cpf;
    private Double income;
    @Column(columnDefinition = "DATE")
    private LocalDate birthDate;
    private Integer children;

    public Client() {
    }

    public Client(LocalDate birthDate, Integer children, String cpf, Long id, Double income, String name) {
        this.birthDate = birthDate;
        this.children = children;
        this.cpf = cpf;
        this.id = id;
        this.income = income;
        this.name = name;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }

    public String getCpf() {
        return cpf;
    }

    public Long getId() {
        return id;
    }

    public Double getIncome() {
        return income;
    }

    public String getName() {
        return name;
    }
}
