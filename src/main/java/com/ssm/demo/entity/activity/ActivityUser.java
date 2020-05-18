package com.ssm.demo.entity.activity;

import com.ssm.demo.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @Author Administrator
 * @Date 2020/5/18 10:05
 * @Describe 活动bean
 * @Version 1.0
 */
@Setter
@Getter
public class ActivityUser extends BaseEntity {
    /*用户编号*/
    private Long userId;
    /*活动编号*/
    private Long activityId;
    /*媒体类型*/
    private Long mid;
    /*赠送金额*/
    private BigDecimal recharge;
}
