package com.yyf.controller;

import com.yyf.po.User;
import com.yyf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * 用户控制类，用于处理用户控制的请求逻辑
 * 1. 用户登录时：用户名和密码验证
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login.action", method = RequestMethod.POST)
    public String login(String usercode, String password, Model model, HttpSession session){
        User user = userService.findUser(usercode, password);
        if(user != null){
            session.setAttribute("USER_SESSION", user);
//            return "customer";
            return "redirect:customer/list.action";
        }
        model.addAttribute("msg", "账号或密码错误，请重新输入！");
        return  "login";
    }

    @RequestMapping(value = "/toCustomer.action")
    public String toCustomer(){
        return "customer";
    }

    @RequestMapping(value = "/logout.action")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:login.action";
    }

    @RequestMapping(value = "/login.action", method = RequestMethod.GET)
    public String toLogin(){
        return "login";
    }
}
