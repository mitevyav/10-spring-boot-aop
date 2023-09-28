package com.luv2code.aop.dao;

import com.luv2code.aop.entity.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO {

    private String name;

    private String serviceCode;

    @Override
    public void addAccount(Account account, boolean vipFlag) {
        System.out.println(getClass() + "   ADD ACCOUNT\n");
    }

    @Override
    public boolean addSecondAccount(Account account) {
        System.out.println(getClass() + "   ADD SECOND ACCOUNT\n");
        return true;
    }

    @Override
    public String getName() {
        System.out.println(getClass() + "   getName()\n");
        return name;
    }

    @Override
    public void setName(String name) {
        System.out.println(getClass() + "   setName()\n");
        this.name = name;
    }

    @Override
    public String getServiceCode() {
        System.out.println(getClass() + "   getServiceCode()\n");
        return serviceCode;
    }

    @Override
    public void setServiceCode(String serviceCode) {
        System.out.println(getClass() + "   setServiceCode()\n");
        this.serviceCode = serviceCode;
    }
}
