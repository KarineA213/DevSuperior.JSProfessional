package com.devsuperior.crud.dto;

import com.devsuperior.crud.entities.Client;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;


public class ClientDTO {

    private Long id;
    @NotBlank(message = "Campo obrigatório name")
    private String name;
    @Size(min = 11, max = 14)
    @NotBlank(message = "Campo obrigatório CPF")
    private String cpf;
    private Double income;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDate;
    @NotNull(message = "Insira a quantidade de crianças")
    private Integer children;

    public ClientDTO(LocalDate birthDate, Integer children, String cpf, Long id, Double income, String name) {
        this.birthDate = birthDate;
        this.children = children;
        this.cpf = cpf;
        this.id = id;
        this.income = income;
        this.name = name;
    }

    public ClientDTO(Client entity) {
        birthDate = entity.getBirthDate();
        children = entity.getChildren();
        cpf = entity.getCpf();
        id = entity.getId();
        income = entity.getIncome();
        name = entity.getName();
    }


    public ClientDTO() {
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
}
