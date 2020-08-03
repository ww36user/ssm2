package com.wei.controller;

import com.wei.domain.Account;
import com.wei.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController  {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Account> accounts = accountService.findAll();
        model.addAttribute("accounts",accounts);
        return "list";
    }

    @RequestMapping("/save")
    public void save(HttpServletRequest request, HttpServletResponse response,Account account) throws IOException {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return;
    }


}