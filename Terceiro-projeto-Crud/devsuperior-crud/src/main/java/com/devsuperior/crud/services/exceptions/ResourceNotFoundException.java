package com.devsuperior.crud.services.exceptions;


//poderia também ser Exception mas escolheu esta por não precisar usar o try/catch e usar o orelsethrow
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);

    }




}
