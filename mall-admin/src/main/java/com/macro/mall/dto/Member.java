package com.macro.mall.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/*
   会员的实体
 */
@Getter
@Setter
public class Member {
    private String bianHao; //自动生成
    private String name;
    private String sex;
    private Integer age;
    private String phone;
    private Date time;
}
