package com.luv2code.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {

    @Pointcut("execution(* com.luv2code.aop.dao.*.*(..))")
    public void forDaoPackage() {}

    @Before("forDaoPackage()")
    public void beforeAddAccountAdvice() {
        System.out.println("\n======>>> BEFORE[beforeAddAccountAdvice] execution inside: " + getClass());
    }

    @Before("forDaoPackage()")
    public void analyzeApi() {
        System.out.println("\n======>>> BEFORE[analyzeApi] execution inside: " + getClass());
    }
}
