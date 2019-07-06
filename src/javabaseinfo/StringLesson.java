/*String类
@deacription: String 类是不可改变的，所以你一旦创建了 String 对象，那它的值就无法改变了
@Date 18:10 2019/7/5
 */
package javabaseinfo;
public class StringLesson {

    public static void stringMethod1(){
        char[] newArray ={'l','i','u','h','u','i'};
        String str = new String(newArray);
        System.out.println(str);
        String str1 = "Hello,";
        String str2 = "liuhuiting";
        System.out.println("字符串1的长度是："+str1.length());
        String str3 = str1.concat(str2);
        System.out.println("str1连接str2后的字符串是："+str3);
    }
    /*
    *@Date:18:15 2019/7/5
    *@Description:  toCharArray()方法将字符串转换为字符数组
    *@param:[]
    *@return:void
    **/
    public static void stringMethod2(){
        String str = new String("liuhuiting");
        char[] chars= str.toCharArray();
        System.out.println(chars);
        for(int i=0;i<chars.length;i++){
            System.out.print(chars[i]+" ,");
        }
        System.out.println();
        for(char ch:chars){
            System.out.print(ch +" ");
        }
    }
    public  static  void main(String[] args){
//        stringMethod1();
        stringMethod2();
    }
}
