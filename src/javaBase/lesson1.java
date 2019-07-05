/*
Math类的使用
 */
package javaBase;

public class lesson1 {

    /*向上、向下取整的方法
     ceil()   返回大于等于( >= )给定参数的的最小整数，类型为双精度浮点型。
     floor()  返回小于等于（<=）给定参数的最大整数 。
     round()它表示四舍五入，Math.round(11.5) 的结果为12，Math.round(-11.5) 的结果为-11。
   */
    public  static void mathTest1(double num){
        System.out.println("Math.floor("+num+")="+Math.floor(num));
        System.out.println("Math.round("+num+")="+Math.round(num));
        System.out.println("Math.ceil("+num+")="+Math.ceil(num));
    }

    public static void mathTest2(){
        Integer a = 10;
        Integer b = 12;
        Integer x = 5;
//        System.out.println(a.valueOf());
        System.out.println("a.equals(b):"+a.equals(b));

        // 返回 byte 原生数据类型
        System.out.println( x.byteValue() );

    }
    public  static void main(String[] args){
       double[]  dols ={ 1.4, 1.5, 1.6, -1.4, -1.5, -1.6 };
       for(double dol:dols){
           mathTest1(dol);
       }
       mathTest2();
    }
}
