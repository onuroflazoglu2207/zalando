package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserGetByIdException extends AbstractThrowableProblem {

    private static final String text = " is not found, function = getById";
    private final Long identity;

    public UserGetByIdException(final Long identity) {
        super(null, identity + text, Status.NOT_FOUND);
        this.identity = identity;
    }

    public String getErrorMessage() {
        return identity + text;
    }
}
