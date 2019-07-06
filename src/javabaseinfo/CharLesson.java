package javabaseinfo;
//Character类
public class CharLesson {
    public  static  void main(String[] args){
        Character ch = new Character('z');
        Character ch1 = 'f';
        System.out.println(Character.toUpperCase('c'));
        System.out.println(Character.toLowerCase('Y'));
        System.out.println("是一个字母吗："+Character.isLetter('Y'));
        System.out.println("是一个数字吗："+Character.isDigit('Y'));
        System.out.println(Character.isDigit('5'));
        System.out.println(Character.toString('Y'));
    }

}
