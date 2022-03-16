package com.example.demo.advice;

import com.example.demo.exception.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.NativeWebRequest;
import org.zalando.problem.Problem;
import org.zalando.problem.spring.web.advice.ProblemHandling;

@ControllerAdvice
public class UserExceptionHandler implements ProblemHandling {

    @ExceptionHandler(UserGetByIdException.class)
    public ResponseEntity<Problem> getByIdHandler(UserGetByIdException ex, NativeWebRequest request) {
        Problem problem = Problem.builder().withStatus(ex.getStatus()).with("message", ex.getErrorMessage()).build();
        return create(ex, problem, request);
    }

    @ExceptionHandler(UserSaveException.class)
    public ResponseEntity<Problem> saveHandler(UserSaveException ex, NativeWebRequest request) {
        Problem problem = Problem.builder().withStatus(ex.getStatus()).with("message", ex.text).build();
        return create(ex, problem, request);
    }

    @ExceptionHandler(UserUpdateException.class)
    public ResponseEntity<Problem> updateHandler(UserUpdateException ex, NativeWebRequest request) {
        Problem problem = Problem.builder().withStatus(ex.getStatus()).with("message", ex.getErrorMessage()).build();
        return create(ex, problem, request);
    }

    @ExceptionHandler(UserDeleteException.class)
    public ResponseEntity<Problem> deleteHandler(UserDeleteException ex, NativeWebRequest request) {
        Problem problem = Problem.builder().withStatus(ex.getStatus()).with("message", ex.getErrorMessage()).build();
        return create(ex, problem, request);
    }
}
