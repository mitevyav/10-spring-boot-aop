package com.luv2code.aop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO {
    @Override
    public void addAccount() {
        System.out.println(getClass() + "   ADD ACCOUNT");
    }

    @Override
    public void addSecondAccount() {
        System.out.println(getClass() + "   ADD SECOND ACCOUNT");
    }
}
