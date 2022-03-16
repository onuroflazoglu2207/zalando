package com.example.demo.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class UserUpdateException extends AbstractThrowableProblem {

    private static final String text = ", function = update";
    private final String message;

    public UserUpdateException(final String message) {
        super(null, message + text, Status.CONFLICT);
        this.message = message;
    }

    public String getErrorMessage() {
        return message + text;
    }
}
