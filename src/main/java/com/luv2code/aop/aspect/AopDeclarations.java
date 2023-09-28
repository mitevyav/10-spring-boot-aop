package com.luv2code.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;


public class AopDeclarations {

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
}
