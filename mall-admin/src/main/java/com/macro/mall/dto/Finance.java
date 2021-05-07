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

@Getter
@Setter
public class Finance {

    private Integer id;
    private String number;
    private String saleName;
    private String huohao;
    private Integer quantity;
    private double money;
    private Date time;
    private String year;
    private String month;

}
