package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

//@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class UserDeleteException extends AbstractThrowableProblem {

    private static final String text = " is not found, function = delete";
    private final Long identity;

    public UserDeleteException(final Long identity) {
        //super(null, identity + text, Status.INTERNAL_SERVER_ERROR);
        super(null, identity + text, Status.NOT_FOUND);
        this.identity = identity;
    }

    public String getErrorMessage() {
        return identity + text;
    }
}
