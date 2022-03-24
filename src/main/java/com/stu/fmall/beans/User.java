package com.stu.fmall.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Richered
 * @Date: 2022/3/24 13:42
 * @Description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int userId;

    private String userName;

    private String userPwd;

    private String userRealName;

    private String userImg;
}
