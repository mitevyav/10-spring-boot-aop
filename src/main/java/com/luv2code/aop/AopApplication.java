package com.luv2code.aop;

import com.luv2code.aop.dao.AccountDAO;
import com.luv2code.aop.dao.MembershipDAO;
import com.luv2code.aop.dao2.AccountDAO2;
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
    public CommandLineRunner commandLineRunner(
            AccountDAO accountDao,
            MembershipDAO memberShipDAO,
            AccountDAO2 accountDAO2) {
        return runner -> {
            demoTheBeforeAdvice(accountDao, memberShipDAO, accountDAO2);
        };
    }

    private void demoTheBeforeAdvice(AccountDAO accountDao, MembershipDAO memberShipDAO, AccountDAO2 accountDAO2) {
        accountDao.addAccount(new Account(), true);
        accountDao.addSecondAccount(new Account());
        memberShipDAO.addAccount();
        memberShipDAO.addMembership();
        accountDAO2.addAccount2(new Account(), true);
        accountDAO2.addSecondAccount2(new Account());
    }

}
