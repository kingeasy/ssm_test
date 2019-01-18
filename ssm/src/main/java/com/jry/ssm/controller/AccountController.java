package com.jry.ssm.controller;

import com.jry.ssm.domain.Account;
import com.jry.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: jry
 * @CreateDate: 2019/1/12 18:58
 * @Version: 1.0
 */

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public ModelAndView findAll() {
        ModelAndView mv = new ModelAndView();
        List<Account> accounts = accountService.findAll();
        mv.addObject("accounts", accounts);
        mv.setViewName("success");
        return mv;
    }

    @RequestMapping("transfer")
    public String transfer(String s, String t, Double m) {
        accountService.transfer(s, t, m);
        return "success";
    }
}
