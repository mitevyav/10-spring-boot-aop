package com.luv2code.aop.dao2;

import com.luv2code.aop.entity.Account;

public interface AccountDAO2 {

    void addAccount2(Account account, boolean vipFlag);

    boolean addSecondAccount2(Account account);
}
