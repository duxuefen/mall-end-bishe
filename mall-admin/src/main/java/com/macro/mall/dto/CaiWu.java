package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

/**
 * @ClassName dxf
 * @Author lenovo
 * @Date 2021/3/29 17:16
 * @Version 1.0
 **/

public class CaiWu {


    private Date time;
    private String shangping;
    private String bianhao;
    private String qian;
    private String nian;
    private String yue;

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getShangping() {
        return shangping;
    }

    public void setShangping(String shangping) {
        this.shangping = shangping;
    }

    public String getBianhao() {
        return bianhao;
    }

    public void setBianhao(String bianhao) {
        this.bianhao = bianhao;
    }

    public String getQian() {
        return qian;
    }

    public void setQian(String qian) {
        this.qian = qian;
    }

    public String getNian() {
        return nian;
    }

    public void setNian(String nian) {
        this.nian = nian;
    }

    public String getYue() {
        return yue;
    }

    public void setYue(String yue) {
        this.yue = yue;
    }
}
