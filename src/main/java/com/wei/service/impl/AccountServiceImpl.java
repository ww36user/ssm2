package com.wei.service.impl;

import com.wei.dao.AccountDao;
import com.wei.domain.Account;
import com.wei.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("AccountServiceImpl调用了findAll");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("AccountServiceImpl调用了saveAccount");
        accountDao.saveAccount(account);
    }
}
