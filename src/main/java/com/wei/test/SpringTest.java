package com.wei.test;

import com.wei.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void run() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.findAll();
    }
}
