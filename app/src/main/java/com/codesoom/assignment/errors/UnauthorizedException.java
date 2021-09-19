package com.codesoom.assignment.errors;

public class UnauthorizedException extends RuntimeException {

    public UnauthorizedException(String accessToken) {
        super("Unauthorized :" + accessToken);
    }

}