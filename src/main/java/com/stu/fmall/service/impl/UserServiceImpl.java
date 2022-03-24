package com.stu.fmall.service.impl;

import com.stu.fmall.beans.User;
import com.stu.fmall.common.ResultVO;
import com.stu.fmall.mapper.UserDAO;
import com.stu.fmall.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: Richered
 * @Date: 2022/3/24 13:43
 * @Description
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDAO userDAO;

    @Override
    public ResultVO checkLogin(String name, String pwd) {

        User user = userDAO.queryUserByName(name);

        if (user == null){
            return  new ResultVO(10001, "用户名不存在", null);
        }else {
            if (user.getUserPwd().equals(pwd)){
                return new ResultVO(10000, "登录成功", user);
            }else {
                return new ResultVO(10001, "密码错误", null);
            }
        }
    }
}
