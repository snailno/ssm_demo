package com.ssm.demo.entity.activity;

import com.ssm.demo.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author Administrator
 * @Date 2020/5/18 10:22
 * @Describe 签到bean
 * @Version 1.0
 */
@Setter
@Getter
public class ClockIn extends BaseEntity {
    /*用户id*/
    private Long userId;
    /*用户姓名*/
    private String userName;
    /*天次*/
    private int dayOfWeek;
    /*周次*/
    private String weekOfYear;
}
