package com.luv2code.aop.dao;

import com.luv2code.aop.entity.Account;

public interface AccountDAO {

    void addAccount(Account account, boolean vipFlag);

    boolean addSecondAccount(Account account);
}
