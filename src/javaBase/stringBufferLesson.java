/*
@Author:LiuHuiting
@Date: 18:10 2019/7/5
@Description: StringBuffer是线程安全的,所以用StringBuilder比较多
*/
package javaBase;

public class stringBufferLesson {

    public static  void stringBufferMethod1( ){
        StringBuffer sb= new StringBuffer("use-stringbuffer");
        StringBuffer sb1= new StringBuffer("hello，Python and java");
        sb.append("yoyoyo");
        sb.append("jiayou");
        System.out.println(sb);
//        字符串反转
//        System.out.println(sb.reverse());
//        移除此序列的子字符串中的字符----public delete(int start, int end)
        System.out.println(sb.delete(0,3));
        System.out.println(sb1.length());
        System.out.println(sb1.replace(6,12,"goGogo"));
        //返回此序列中指定索引处的 char 值
        System.out.println(sb1.charAt(4));

        //返回第一次出现的指定子字符串在该字符串中的索引。
        System.out.println(sb1.indexOf("llo"));
    }
    public static  void main(String[] args){
        stringBufferMethod1();
    }
}
