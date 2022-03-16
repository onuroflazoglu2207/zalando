package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class UserSaveException extends AbstractThrowableProblem {

    public static final String text = "Some field is unacceptable, function = save";

    public UserSaveException() {
        super(null, text, Status.BAD_REQUEST);
    }
}