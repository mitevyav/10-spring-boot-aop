package com.luv2code.aop.dao2;

import com.luv2code.aop.dao.AccountDAO;
import com.luv2code.aop.entity.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl2 implements AccountDAO2 {
    @Override
    public void addAccount2(Account account, boolean vipFlag) {
        System.out.println(getClass() + "   ADD ACCOUNT22222222\n");
    }

    @Override
    public boolean addSecondAccount2(Account account) {
        System.out.println(getClass() + "   ADD SECOND ACCOUNT222222222\n");
        return true;
    }
}
