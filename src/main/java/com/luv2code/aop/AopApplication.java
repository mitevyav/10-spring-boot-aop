package com.luv2code.aop;

import com.luv2code.aop.dao.AccountDAO;
import com.luv2code.aop.dao.MembershipDAO;
import com.luv2code.aop.entity.Account;
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
    public CommandLineRunner commandLineRunner(AccountDAO accountDao, MembershipDAO memberShipDAO) {
        return runner -> {
            demoTheBeforeAdvice(accountDao, memberShipDAO);
        };
    }

    private void demoTheBeforeAdvice(AccountDAO accountDao, MembershipDAO memberShipDAO) {
        accountDao.addAccount(new Account(), true);
        accountDao.addSecondAccount(new Account());
        memberShipDAO.addAccount();
        memberShipDAO.addMembership();
    }

}
