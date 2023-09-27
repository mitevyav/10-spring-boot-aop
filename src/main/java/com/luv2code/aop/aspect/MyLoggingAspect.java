package com.luv2code.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {

    @Before("execution(* add*(com.luv2code.aop.entity.Account))")
    public void beforeAddAccountAdvice() {
        System.out.println("\n======>>> BEFORE execution inside: " + getClass());
    }
}
