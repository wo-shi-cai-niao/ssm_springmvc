package com.baizhi.service;


import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public void findOne(HttpServletRequest request,User user) {
        User user1 = userDao.selectOne(user.getUsername());
        if (user1 == null) {
            throw new RuntimeException("用户不存在");
        }else if(!user.getPassword().equals(user1.getPassword())){
            throw new RuntimeException("密码错误");
        }else{
             request.getSession().setAttribute("login",user1);
        }
    }
}
