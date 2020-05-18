package com.ssm.demo.entity.activity;

import com.ssm.demo.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author Administrator
 * @Date 2020/5/18 10:02
 * @Describe 活动类型bean
 * @Version 1.0
 */
@Setter
@Getter
public class ActivityType extends BaseEntity {
    /*活动类型名*/
    private String name;
    /*针对活动类型的描述*/
    private String memo;
    /*状态：1启动；0禁用*/
    private Byte status;
}
