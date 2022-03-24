package com.stu.fmall.mapper;

import com.stu.fmall.beans.User;

/**
 * @Author: Richered
 * @Date: 2022/3/24 13:44
 * @Description
 */
public interface UserDAO {

    User queryUserByName(String name);
}
