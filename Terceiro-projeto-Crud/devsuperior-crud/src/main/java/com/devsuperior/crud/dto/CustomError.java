package com.devsuperior.crud.dto;

import java.time.Instant;

public class CustomError {
    //todos os atributos de um erro
    private Instant timestamp;
    private Integer status;
    private String error;
    private String path;

    public CustomError(Instant timestamp, Integer status, String error , String path) {
        this.error = error;
        this.path = path;
        this.status = status;
        this.timestamp = timestamp;
    }


    public String getError() {
        return error;
    }

    public String getPath() {
        return path;
    }

    public Integer getStatus() {
        return status;
    }

    public Instant getTimestamp() {
        return timestamp;
    }
}
