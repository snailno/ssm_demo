package com.ssm.demo.entity.app;

import com.ssm.demo.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author Administrator
 * @Date 2020/5/18 10:35
 * @Version 1.0
 */
@Setter
@Getter
public class PayWayConfig extends BaseEntity {
    /*支付名称*/
    private String payName;
}
