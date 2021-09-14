package day02;
/*
String 类型的使用
1.String属于引用数据类型,字符串
2.声明String类型变量时,使用一对双引号 "" 
3.String可以和8种基本数据类型做计算,且运算只能是连接运算
4.运算的结果仍然String类型
*/

public class StringTest {
    public static void main(String[] args) {
        //String s1 = ""; 可以为0个字符
        //char c1=''; 编译不通过,必须放一个字符

        int number = 1001;
        String numberStr = "学号: ";
        String info = numberStr + number; // +: 连接运算
        boolean b1 = true;
        String info1 = info + b1; // +: 连接运算

        System.out.println(info1);


        //练习1
        char c = 'a';
        int num = 10;
        String str = "hello";
        System.out.println(c + num + str);
        System.out.println(c + str + num);
        System.out.println(str + num + c);
        System.out.println(c + (num + str));
        System.out.println((c + num) + str);

        String str2 = 3.5f + "";
        System.out.println(str2);
    }
}
