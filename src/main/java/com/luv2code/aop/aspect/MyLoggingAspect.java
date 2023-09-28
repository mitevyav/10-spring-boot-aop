package com.luv2code.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {

    @Pointcut("execution(* com.luv2code.aop.dao.*.*(..))")
    public void forDaoPackage() {
    }

    @Pointcut("execution(* com.luv2code.aop.dao.*.get*(..))")
    public void getter() {
    }

    @Pointcut("execution(* com.luv2code.aop.dao.*.set*(..))")
    public void setter() {
    }

    @Pointcut("forDaoPackage() && !(getter() || setter())")
    public void forDaoPackageNoGetterSetter() {
    }

    @Before("forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice() {
        System.out.println("\n======>>> BEFORE[beforeAddAccountAdvice] execution inside: " + getClass());
    }

    @Before("forDaoPackage()")
    public void performApiAnalytics() {
        System.out.println("\n======>>> BEFORE[performApiAnalytics] execution inside: " + getClass());
    }
}
