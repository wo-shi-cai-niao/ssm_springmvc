package com.baizhi.service;

import com.baizhi.entity.User;

import javax.servlet.http.HttpServletRequest;

public interface UserService {
    void findOne(HttpServletRequest request,User user);
}
