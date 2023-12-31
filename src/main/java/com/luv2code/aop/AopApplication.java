package com.luv2code.aop;

import com.luv2code.aop.dao.AccountDAO;
import com.luv2code.aop.dao.MembershipDAO;
import com.luv2code.aop.dao2.AccountDAO2;
import com.luv2code.aop.entity.Account;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

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
//            demoTheBeforeAdvice(accountDao, memberShipDAO, accountDAO2);
            demoTheAfterReturningAdvice(accountDao);
        };
    }

    private void demoTheAfterReturningAdvice(AccountDAO accountDao) {
        List<Account> accountList = accountDao.findAccounts();

        System.out.println("Finished getting accounts");

        System.out.println("Accounts: " + accountList);
    }

    private void demoTheBeforeAdvice(AccountDAO accountDao, MembershipDAO memberShipDAO, AccountDAO2 accountDAO2) {
        Account account = new Account();
        account.setName("Frodo");
        account.setLevel("Ring bearer");
        accountDao.addAccount(account, true);
        accountDao.addSecondAccount(new Account());

        accountDao.setName("Frodo");
        accountDao.getName();
        accountDao.setServiceCode("silver");
        accountDao.getServiceCode();


        memberShipDAO.addAccount();
        memberShipDAO.addMembership();
    }

}
