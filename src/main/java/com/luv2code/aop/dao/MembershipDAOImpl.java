package com.luv2code.aop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDAOImpl implements MembershipDAO {
    @Override
    public void addAccount() {
        System.out.println(getClass() + "   ADD Membership\n");
    }

    @Override
    public void addMembership() {
        System.out.println(getClass() + "   ADD SECOND Membership\n");
    }
}
