package com.jry.ssm.service.impl;

import com.jry.ssm.dao.AccountDao;
import com.jry.ssm.domain.Account;
import com.jry.ssm.exception.TransferException;
import com.jry.ssm.service.AccountService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: java类作用描述
 * @Author: jry
 * @CreateDate: 2019/1/12 18:40
 * @Version: 1.0
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public void transfer(String s, String t, Double m) {
        Account sa = accountDao.findByName(s);
        if (sa == null) {
            throw new TransferException("转账方不存在");
        }
        if (m < 0) {
            throw new TransferException("转账金额不能是负数");
        }
        if (sa.getMoney() < m) {
            throw new TransferException("账户金额不足");
        }
        Account ta = accountDao.findByName(t);
        if (ta == null) {
            throw new TransferException("收钱方不存在");
        }
        sa.setMoney(sa.getMoney() - m);
        ta.setMoney(ta.getMoney() + m);
        accountDao.update(sa);
//        int i = 1 / 0;
        accountDao.update(ta);
    }
}
