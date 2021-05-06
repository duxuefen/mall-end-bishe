package com.macro.mall.common;



import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.MONTHS;

/**
 * @ClassName dxf
 * @Author lenovo
 * @Date 2021/4/8 15:38
 * @Version 1.0
 **/
public class DateUtil {
    private static DateTimeFormatter sdf = DateTimeFormatter.ofPattern(TimeUtils.SIMPLE_DATE_FORMAT);
    /**
     * “yyyy-MM-dd HH:mm:ss”日期时间格式 如：2010-04-16 16:00:03
     */
    public final static String DATETIME_FULL = "yyyy-MM-dd HH:mm:ss";

    /**
     * <p>当前服务器时间</p>
     *
     * @return
     */
    public static Date currentDate() {
        Calendar cal = Calendar.getInstance();
        return cal.getTime();
    }

    /**
     * <p>
     * 获得当前月的上个月的第一天
     * </p>
     *
     * @return
     * @author CHR 2017-12-21
     */
    public static String getLastMonthFirst() {
        LocalDate date = LocalDate.now();
        date = date.minusMonths(1);
        String firstDay = sdf.format(date.with(TemporalAdjusters.firstDayOfMonth()));
        return firstDay;
    }

    /**
     * <p>
     * 获取当前年上一年的第一天
     * </p>
     *
     * @param str
     * @return java.lang.String
     * @throws
     * @author DyLuo
     * @date 2020/6/10 19:53
     */
    public static String getLastYearFirst(String str) {
        LocalDate date = LocalDate.parse(str, DateTimeFormatter.BASIC_ISO_DATE);
        date = date.minusYears(1);
        String firstDay = sdf.format(date.with(TemporalAdjusters.firstDayOfMonth()));
        return firstDay;
    }
    /**
     * <p>
     * 当前月变为下一年的这个月
     * </p>
     *
     * @param str
     * @return java.lang.String
     * @throws
     * @author DyLuo
     * @date 2020/6/10 19:53
     */
    public static String getNextYear(String str) {
        LocalDate date = LocalDate.parse(str, DateTimeFormatter.BASIC_ISO_DATE);
        date = date.plusYears(1);
        String firstDay = sdf.format(date.with(TemporalAdjusters.firstDayOfMonth()));
        return firstDay.substring(0, 6);
    }

    /**
     * <p>获取当前日期字符串 </p>
     *
     * @param format 指定的日期格式
     * @return String 返回指定格式的日期字符串
     */
    public static String currentDate(String format) {
        return DateUtil.format(currentDate(), format);
    }

    /**
     * <p>获取格式化日期字符串  时间转换为字符串</p>
     *
     * @param date   指定的日期
     * @param format 指定的日期格式
     * @return String 返回指定格式的日期字符串
     */
    public static String format(Date date, String format) {
        if (StringUtils.isBlank(format)) {
            format = DateUtil.DATETIME_FULL;
        }
        if (date == null) {
            date = currentDate();
        }
        return DateFormatUtils.format(date, format);
    }
    /**
     * <p>
     * 获得上月第一天
     * </p>
     *
     * @param str
     * @return
     * @throws Exception
     * @author CHR 2017-12-28
     */
    public static String getLastMonthFirst(String str) {
        LocalDate date = LocalDate.parse(str, DateTimeFormatter.BASIC_ISO_DATE);
        date = date.minusMonths(1);
        String firstDay = sdf.format(date.with(TemporalAdjusters.firstDayOfMonth()));
        return firstDay;
    }

    /**
     * <p>
     * 获得前n个月第一天
     * </p>s
     *
     * @param str
     * @param month
     * @return
     * @throws Exception
     * @author CHR 2017-12-28
     */
    public static String getLastMonthFirst(String str, Integer month) {
        LocalDate date = LocalDate.parse(str, DateTimeFormatter.BASIC_ISO_DATE);
        date = date.minusMonths(month);
        String firstDay = sdf.format(date.with(TemporalAdjusters.firstDayOfMonth()));
        return firstDay;
    }
    /**
     * @Author dxf
     * @Description //TODO 获取前N个月的最后一天
     * @Date 15:54 2021/4/8
     * @Param [str, month]
     * @return
     **/
    public static String getLastMonthEnd(String str, Integer month) {
        LocalDate date = LocalDate.parse(str, DateTimeFormatter.BASIC_ISO_DATE);
        date = date.minusMonths(month);
        String lastDay = sdf.format(date.with(TemporalAdjusters.lastDayOfMonth()));
        return lastDay;
    }

    /**
     * <p>
     * 获得上月最后一天
     * </p>
     *
     * @param str
     * @return
     * @throws Exception
     * @author CHR 2017-12-28
     */
    public static String getLastMonthEnd(String str) {
        LocalDate date = LocalDate.parse(str, DateTimeFormatter.BASIC_ISO_DATE);
        date = date.minusMonths(1);
        String lastDay = sdf.format(date.with(TemporalAdjusters.lastDayOfMonth()));
        return lastDay;
    }

    /**
     * <p>
     * 获得下一个月的月份
     * </p>
     *
     * @param str
     * @return
     * @throws Exception
     * @throws Exception
     * @author LZhang 2018-3-15
     */
    public static String getNextMonth(String str) {
        LocalDate date = LocalDate.parse(str, DateTimeFormatter.BASIC_ISO_DATE);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMM");
        String nextMonth = dtf.format(date.plusMonths(1));
        return nextMonth;
    }

    /**
     * <p>
     * 获得下一个月的最后一天
     * </p>
     *
     * @param str
     * @return
     * @throws Exception
     * @throws Exception
     * @author LZhang 2018-3-15
     */
    public static String getNextMonthLast(String str) {
        LocalDate date = LocalDate.parse(str, DateTimeFormatter.BASIC_ISO_DATE);
        date = date.plusMonths(1);
        String lastDay = sdf.format(date.with(TemporalAdjusters.lastDayOfMonth()));
        return lastDay;
    }

    /**
     * <p>
     * 时间比较（判断第二个日期是否大于等于第一个日期）
     * </p>
     *
     * @param dateOne
     * @param dateTwo
     * @return
     * @throws Exception
     * @author CHR 2018-3-13
     */
    public static boolean compareDate(String dateOne, String dateTwo) {
        try {


            LocalDate dtOne = LocalDate.parse(dateOne, DateTimeFormatter.BASIC_ISO_DATE);
            LocalDate dtTwo = LocalDate.parse(dateTwo, DateTimeFormatter.BASIC_ISO_DATE);
            if (dtTwo.isAfter(dtOne) || dtTwo.isEqual(dtOne)) {//第二个参数大于或等于第一个参数
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            return false;
        }
    }

    /**
     * <p>
     * 时间比较（判断第二个日期是否小于第一个日期）
     * </p>
     *
     * @param dateOne
     * @param dateTwo
     * @return
     * @throws Exception
     * @author Ldy 2018-10-30
     */
    public static boolean compareToDate(String dateOne, String dateTwo) {
        LocalDate dtOne = LocalDate.parse(dateOne, DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate dtTwo = LocalDate.parse(dateTwo, DateTimeFormatter.BASIC_ISO_DATE);
        if (dtTwo.isBefore(dtOne)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * <p>
     * 获取上个月
     * </p>
     *
     * @param sbq
     * @return
     * @throws Exception
     * @author LZhang 2018-4-9
     */
    public static LastDate getLastBean(String sbq) {
        LastDate date = new LastDate();
        String time = sbq + "01";
        date.setTime(time);
        date.setFirstDay(getLastMonthFirst(time));
        date.setLastDay(getLastMonthEnd(time));
        return date;
    }

    /**
     * <p>
     * 获取指定月份的最后一天
     * </p>
     *
     * @param str
     * @return
     * @throws Exception
     * @author LZhang 2018-5-30
     */
    public static String getLastDay(String str) {
        LocalDate date = LocalDate.parse(str, DateTimeFormatter.BASIC_ISO_DATE);
        String lastDay = sdf.format(date.with(TemporalAdjusters.lastDayOfMonth()));
        return lastDay;
    }

    /**
     * <p>
     * 获取指定月份的第一天
     * </p>
     *
     * @param str
     * @return
     * @throws Exception
     * @author LZhang 2018-5-30
     */
    public static String getFirstDay(String str) {
        String firstDay = str.substring(0, 6) + "01";
        return firstDay;
    }

    /**
     * <p>
     * 获取某年第一天日期
     * </p>
     *
     * @param day 格式：年月日都要有
     * @return
     * @author Ldy 2018-9-13
     */
    public static String getYearFirst(String day) {
        LocalDate date = LocalDate.parse(day, DateTimeFormatter.BASIC_ISO_DATE);
        String currYearFirst = sdf.format(date.with(TemporalAdjusters.firstDayOfYear()));
        return currYearFirst;
    }

    /**
     * <p>
     * 获取某年最后一天日期
     * </p>
     *
     * @param day 格式：年月日都要有
     * @return
     * @author Ldy 2018-9-13
     */
    public static String getYearLast(String day) {
        LocalDate date = LocalDate.parse(day, DateTimeFormatter.BASIC_ISO_DATE);
        String currYearFirst = sdf.format(date.with(TemporalAdjusters.lastDayOfYear()));
        return currYearFirst;
    }

    /**
     * <p>
     * 计算时间差
     * </p>
     *
     * @param dateOne
     * @param dateTwo
     * @return 相差几天
     * @throws Exception
     * @author Ldy 2018-10-9
     */
    public static Integer countDate(String dateOne, String dateTwo) {
        LocalDate dtOne = LocalDate.parse(dateOne, DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate dtTwo = LocalDate.parse(dateTwo, DateTimeFormatter.BASIC_ISO_DATE);
        //第二个参数减第一个参数
        long daysBetween = DAYS.between(dtOne, dtTwo);
        return Math.toIntExact(daysBetween);
    }

    /**
     * <p>
     * 获取两个日期相差的月数
     * </p>
     *
     * @param d1
     * @param d2
     * @return d2-d1
     * @throws ParseException
     * @author Ldy 2018-11-1
     */
    public static int getMonths(String d1, String d2) {
        LocalDate dtOne = LocalDate.parse(d1, DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate dtTwo = LocalDate.parse(d2, DateTimeFormatter.BASIC_ISO_DATE);
        long monthsBetween = MONTHS.between(dtOne, dtTwo);
        return Math.toIntExact(monthsBetween);
    }

    /**
     *  * 获取第n个月的第一天
     *
     * @param dateStr
     * @param month
     * @return
     * @throws ParseException
     */
    public static String getFirstDayOfNextMonth(String dateStr, int month) {
        LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.BASIC_ISO_DATE);
        if (month > 0) {
            date = date.plusMonths(month);
        } else {
            date = date.minusMonths(Math.abs(month));
        }
        String firstDay = sdf.format(date.with(TemporalAdjusters.firstDayOfMonth()));
        return firstDay;
    }

    /**
     * 获取当前年月日
     *
     * @return
     */
    public static String getNow() {
        return sdf.format(LocalDate.now());
    }

    public static String getNowTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        return dtf.format(LocalTime.now());
    }


    /**
     * <p>
     * 获取年月日或者年月
     * </p>
     *
     * @param isYearBz
     * @param dateTime
     * @return java.lang.String
     * @throws
     * @author DyLuo
     * @date 2019/9/11 11:21
     */
    private static String dateTime(String isYearBz, Object dateTime) throws ParseException {
        String time = "";
        if (StringUtils.equals(isYearBz, "1")) {
            time = formatDateTime(dateTime, TimeUtils.FULL_DATE_MONTH_FORMAT, "yyyyMM");
        } else {
            time = formatDateTime(dateTime, TimeUtils.FULL_DATE_FORMAT, "yyyyMMdd");
        }
        return time;
    }
    /**
     * @param dateTime
     * @param format
     * @param fullDateMonthFormat
     * @return
     * @throws ParseException
     */
    private static String formatDateTime(Object dateTime, String format, String fullDateMonthFormat) throws ParseException {
        String time = (String) dateTime;
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern(format);
        LocalDate date = LocalDate.parse(time, DateTimeFormatter.BASIC_ISO_DATE);
        return sdf.format(date);

    }


    /**
        获取当前日期的年份
     */

    public static String getYear(){
        Calendar calendar = Calendar.getInstance();
      // 获取当前年
        int year = calendar.get(Calendar.YEAR);
        return String.valueOf(year);

    }

    /**
     * 获取当前日期的月份
     */
    public static String getMonth(){
        Calendar calendar = Calendar.getInstance();
        // 获取月份
        int month = calendar.get(Calendar.MONTH) + 1;
        return String.valueOf(month);
    }

}
