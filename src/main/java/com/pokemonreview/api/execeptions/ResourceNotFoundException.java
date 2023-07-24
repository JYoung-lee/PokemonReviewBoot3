package com.pokemonreview.api.execeptions;

public class ResourceNotFoundException extends MyResourceException {

    public ResourceNotFoundException(String message) {
        super(message);
    }
    @Override
    public int getStatusCode() {
        return 404;
    }
}