package com.jry.ssm.service;

import com.jry.ssm.domain.Account;

import java.util.List;

public interface AccountService {

    List<Account> findAll();

    void transfer(String s, String t, Double m);
}
