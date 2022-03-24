package com.stu.fmall.service;

import com.stu.fmall.common.ResultVO;

/**
 * @Author: Richered
 * @Date: 2022/3/24 13:42
 * @Description
 */
public interface UserService {

    ResultVO checkLogin(String name, String pwd);
}
