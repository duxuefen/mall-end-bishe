package com.macro.mall.common;

/**
 * @ClassName dxf
 * @Author lenovo
 * @Date 2021/4/8 15:56
 * @Version 1.0
 **/
/**
 *
 * <p>
 * 前一个月对象
 * </P>
 * @author LZhang
 *
 */
public class LastDate {
    private String time;
    private String firstDay;// 前一个月第一天
    private String lastDay;// 前一个月最后一天

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFirstDay() {
        return firstDay;
    }

    public void setFirstDay(String firstDay) {
        this.firstDay = firstDay;
    }

    public String getLastDay() {
        return lastDay;
    }

    public void setLastDay(String lastDay) {
        this.lastDay = lastDay;
    }

}
