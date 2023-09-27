package com.luv2code.aop.dao;

import com.luv2code.aop.entity.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO {
    @Override
    public void addAccount(Account account, boolean vipFlag) {
        System.out.println(getClass() + "   ADD ACCOUNT\n");
    }

    @Override
    public boolean addSecondAccount(Account account) {
        System.out.println(getClass() + "   ADD SECOND ACCOUNT\n");
        return true;
    }
}
