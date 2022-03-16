package com.example.demo.advice;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zalando.problem.ProblemModule;
import org.zalando.problem.violations.ConstraintViolationProblemModule;

@Configuration
public class ProblemModuleConfig {

    @Bean
    ConstraintViolationProblemModule constraintViolationProblemModule() {
        return new ConstraintViolationProblemModule();
    }

    @Bean
    ProblemModule problemModule() {
        return new ProblemModule();
    }

    //@Bean
    ////yukaridaki beanlari tek seferde fonsiyon icinde olusturuyor.
    //public ObjectMapper objectMapper() {
    //    return new ObjectMapper().registerModules(new ProblemModule(), new ConstraintViolationProblemModule());
    //}
}
