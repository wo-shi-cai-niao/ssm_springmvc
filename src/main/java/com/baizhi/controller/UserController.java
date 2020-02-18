package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.aspectj.apache.bcel.generic.RET;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("login")
    public String login(HttpServletRequest request, User user){
        try {
            userService.findOne(request,user);
            return "redirect:/file/findFile";
        } catch (Exception e) {
            return "redirect:/userView/login.jsp?message=\"+URLEncoder.encode(e.getMessage(),\"UTF-8\")";
        }
    }
}
