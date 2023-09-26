package com.luv2code.aop;

import com.luv2code.aop.dao.AccountDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopApplication {

    public static void main(String[] args) {
        SpringApplication.run(AopApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AccountDAO accountDao) {
        return runner -> {
            demoTheBeforeAdvice(accountDao);
        };
    }

    private void demoTheBeforeAdvice(AccountDAO accountDao) {
        System.out.println("demoTheBeforeAdvice");
        accountDao.addAccount();
        System.out.println("Call it again!!");
        accountDao.addAccount();
    }

}
