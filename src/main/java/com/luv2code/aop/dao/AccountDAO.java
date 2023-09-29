package com.luv2code.aop.dao;

import com.luv2code.aop.entity.Account;

import java.util.List;

public interface AccountDAO {


    List<Account> findAccounts();

    void addAccount(Account account, boolean vipFlag);

    boolean addSecondAccount(Account account);


    String getName();


    void setName(String name);


    String getServiceCode();

    void setServiceCode(String serviceCode);
}
