package com.example.lab5_ultimate.model.exception;

public class DaoException extends Exception {

    /**
     * Constructor with specified string
     * @param message string
     */
    public DaoException(String message) {
        super(message);
    }

    /**
     * Constructor with specified string and exception
     * @param message string
     * @param e error covered
     */
    public DaoException(String message, Throwable e) {
        super(message, e);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }

}
