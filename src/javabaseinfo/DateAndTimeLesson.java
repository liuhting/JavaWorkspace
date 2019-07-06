/*
 * @Author: LiuHuiting
 * @Date: 2019/7/6 14:05
 * @Description: 时间和日期类--Date 和 Calendar
 */
package javabaseinfo;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateAndTimeLesson {

    public static void dateMethod(Date now) {
        System.out.println("当前时间是："+now.toString());
        //SimpleDateFormat 格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd hh:mm:ss");
        System.out.println("格式化后的时间是："+sdf.format(now));
    }
    /*
    * @Date:14:31 2019/7/6
    * @Description: 计算时间之间的间隔
    * @param:[]
    * @return:void
    **/
    public static void diffTime(){
        try {
            long start = System.currentTimeMillis();
            System.out.println(new Date() + "\n");
            Thread.sleep(60 * 5 * 10);
            System.out.println(new Date() + "\n");
            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println("时间间隔是："+diff);
        }
        catch (Exception e){
            System.out.println("Got an exception!");
        }
    }

    /*
    * @Date:14:34 2019/7/6
    * @Description: Calendar类----获取日期的指定部分：只需要年或者月份。。。。
    * @param:[]
    * @return:void
    **/
    public  static  void calendarMethod(){
        //创建Calendar对象,Calendar类是一个抽象类
        Calendar cal = Calendar.getInstance();  //默认是系统当前日期
        //结合上面一步，创建一个指定日期的Calendar对象
        cal.set(2017,6,15);
        //设置年份、月份、日期等信息
        cal.set(Calendar.YEAR,2008);
        cal.set(Calendar.MONTH,10);
        cal.set(Calendar.DATE,25);
        // 获得年份
        int year = cal.get(Calendar.YEAR);
        // 获得月份
        int month = cal.get(Calendar.MONTH) + 1;
        // 获得日期
        int date = cal.get(Calendar.DATE);
        // 获得小时
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        // 获得分钟
        int minute = cal.get(Calendar.MINUTE);
        // 获得秒
        int second = cal.get(Calendar.SECOND);
        // 获得星期几（注意（这个与Date类是不同的）：1代表星期日、2代表星期1、3代表星期二，以此类推）
        int day = cal.get(Calendar.DAY_OF_WEEK);

        }
    public static void main(String[] args) {
        Date date= new Date();
        dateMethod(date);

    }
}
