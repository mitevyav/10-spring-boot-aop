package com.luv2code.aop.aspect;

import com.luv2code.aop.entity.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
@Order(2)
public class MyLoggingAspect {

    @AfterReturning(
            pointcut = "execution(* com.luv2code.aop.dao.AccountDAO.findAccounts(..))",
            returning = "returnValue"
    )
    public void afterReturningFindAccountsAdvice(
            JoinPoint joinPoint,
            List<Account> returnValue
    ) {
        System.out.println("\n =====>> @AfterReturning Method name: " + joinPoint.getSignature());
        System.out.println("\n =====>> List inside @AfterReturning: " + returnValue);
    }

    @Before("com.luv2code.aop.aspect.AopDeclarations.forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice(JoinPoint joinPoint) {
        System.out.println("\n======>>> BEFORE [beforeAddAccountAdvice] execution inside: " + getClass());

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Method: " + signature);

        Object[] arguments = joinPoint.getArgs();

        for (var arg : arguments) {
            System.out.println("Arg: " + arg);
        }
    }
}
