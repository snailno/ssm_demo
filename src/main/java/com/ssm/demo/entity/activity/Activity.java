package com.ssm.demo.entity.activity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ssm.demo.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @Author Administrator
 * @Date 2020/5/18 9:52
 * @Describe 活动bean
 * @Version 1.0
 */
@Setter
@Getter
public class Activity extends BaseEntity {
    /*活动标题*/
    private String title;
    /*活动图片地址*/
    private String imageUrl;
    /*活动内容*/
    private String content;
    /*活动链接地址*/
    private String url;
    /*活动开始时间*/
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime startTime;
    /*活动结束时间*/
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime endTime;
    /*活动状态：1开启；0禁止*/
    private Byte state;
    /*置顶：1置顶；0不置顶*/
    private Byte stillTop;
    /*显示首页：1显示在首页；0不显示在首页*/
    private Byte showInFirstPage;
    /*是否调用本地：1显示在首页；0不显示在首页*/
    private Byte userLocal;
    /*对应原生彩种Id*/
    private String lotteryId;
    /*对应玩法*/
    private String playType;
}
