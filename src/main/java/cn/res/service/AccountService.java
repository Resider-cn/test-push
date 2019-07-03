package cn.res.service;

import cn.res.domain.Account;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Author Rz
 * @Date 2019/6/27
 * @Time 11:44
 */
public interface AccountService {
    public List<Account> findAll();

    public void transfer(String nameIn, String nameOut, double money);

    public void insert(Account account);


}
