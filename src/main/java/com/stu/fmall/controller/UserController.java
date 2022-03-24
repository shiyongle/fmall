package com.stu.fmall.controller;

import com.stu.fmall.common.ResultVO;
import com.stu.fmall.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Author: Richered
 * @Date: 2022/3/24 13:50
 * @Description
 */
@Controller
@ResponseBody
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService userService;

    public ResultVO login(String name, String pwd){
        return userService.checkLogin(name, pwd);
    }
}
