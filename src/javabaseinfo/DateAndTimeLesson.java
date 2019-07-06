/*
 * @Author: LiuHuiting
 * @Date: 2019/7/6 14:05
 * @Description: 时间和日期类
 */
package javabaseinfo;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateAndTimeLesson {

    public static void dateAndTimeMethod(Date now) {
        System.out.println("当前时间是："+now.toString());
        //SimpleDateFormat 格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd hh:mm:ss");
        System.out.println("格式化后的时间是："+sdf.format(now));
    }

    public static void main(String[] args) {
        Date date= new Date();
        dateAndTimeMethod(date);

    }
}
