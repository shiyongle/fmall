package com.stu.fmall.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Richered
 * @Date: 2022/3/24 13:40
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultVO {

    private int code;

    private String msg;

    private Object data;
}
