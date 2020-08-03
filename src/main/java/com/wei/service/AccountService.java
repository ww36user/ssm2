package com.wei.service;

import com.wei.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
    void saveAccount(Account account);
}
