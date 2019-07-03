package cn.res.controller;

import cn.res.domain.Account;
import cn.res.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author Rz
 * @Date 2019/6/27
 * @Time 12:40
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        System.out.println("this is the method named 'findAll'");
        List<Account> list = accountService.findAll();
        System.out.println("list:" + list.size());
        for (Account a : list) {
            System.out.println(a);
        }
        model.addAttribute("list", list);
        return "success";
    }

    @RequestMapping("/insert")
    public void insert(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.insert(account);
        response.sendRedirect(request.getContextPath() + "/account/findAll");
        return;
    }

    // 转账
    @RequestMapping("/transfer")
    public void transfer(String nameIn, String nameOut, double money, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.transfer(nameIn,nameOut,money);
        response.sendRedirect(request.getContextPath() + "/account/findAll");
        return;
    }

}
