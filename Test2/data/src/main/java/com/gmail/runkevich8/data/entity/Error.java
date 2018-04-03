package com.gmail.runkevich8.data.entity;


public class Error  extends Exception{

    private ErrorType veryBiError;

    public Error(ErrorType veryBiError) {
        this.veryBiError = veryBiError;
    }

    public ErrorType getVeryBiError() {
        return veryBiError;
    }
}
