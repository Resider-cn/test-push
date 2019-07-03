package cn.res.service.impl;

import cn.res.dao.AccountDao;
import cn.res.domain.Account;
import cn.res.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Rz
 * @Date 2019/6/27
 * @Time 14:50
 */
@Service("accountServiceImpl")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }


    @Override
    public void transfer(String nameIn, String nameOut, double money) {
        Account accountIn = accountDao.findAccountByName(nameIn);
        Account accountOut = accountDao.findAccountByName(nameOut);
        System.out.println("in:"+accountIn+"  "+nameIn);
        System.out.println("Out:"+accountOut+"  "+nameOut);
        accountIn.setMoney(accountIn.getMoney()+money);
        accountOut.setMoney(accountOut.getMoney()-money);
        accountDao.transferTo(accountIn);
//        int i = 1/0;
        accountDao.transferIn(accountOut);
    }

    @Override
    public void insert(Account account) {
        accountDao.insert(account);
    }

}
