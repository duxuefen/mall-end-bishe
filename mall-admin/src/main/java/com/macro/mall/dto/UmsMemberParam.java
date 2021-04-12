package com.macro.mall.dto;


import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;


public class UmsMemberParam {

    private String name;
    private String binahao;
    private String sex;
    private String age;

    public UmsMemberParam() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBinahao() {
        return binahao;
    }

    public void setBinahao(String binahao) {
        this.binahao = binahao;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    public UmsMemberParam(String name, String binahao, String sex, String age) {
        this.name = name;
        this.binahao = binahao;
        this.sex = sex;
        this.age = age;
    }
}
