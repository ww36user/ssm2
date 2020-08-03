package com.wei.test;

import com.wei.dao.AccountDao;
import com.wei.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    @Test
    public void run() throws IOException {
        InputStream is = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = build.openSession();
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
        List<Account> all = mapper.findAll();
        sqlSession.close();
        is.close();

    }
    @Test
    public void run2() throws IOException {
        InputStream is = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = build.openSession();
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
        Account account = new Account();account.setName("test2");account.setMoney(1000d);
        mapper.saveAccount(account);
        sqlSession.commit();
        sqlSession.close();is.close();
    }
}
