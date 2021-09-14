package day04;

/*
如何从键盘获取不同类型的变量,需要是要Scanner类

具体实现步骤:
1.导包: import java.util.Scanner;
2.Scanner的实例化Scanner scan = new Scanner(System.in);
3.调用scanner相关的方法,来获取指定类型的变量;

注意:需要根据相应的方法,来输入指定类型的值.如果输入的数据类型与要求的数据类型不匹配,会报异常:InputMismatchException
导致程序终止.
 */
import java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入你的姓名:");
        String name = scan.next();
        System.out.println(name);

        System.out.println("请输入你的年龄:");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("请输入你的体重:");
        double weight = scan.nextDouble();
        System.out.println(weight);

        System.out.println("你是否相中我了呢?(true/false)");
        boolean islove = scan.nextBoolean();
        System.out.println(islove);

        //对于char型的获取,Scanner没有提供相关的方法,只能获取一个字符串.
        System.out.println("请输入你的性别(男/女)");
        String gender = scan.next();//"男"
        char genderChar = gender.charAt(0);//获取索引为0位置上的字符
        System.out.println(genderChar);

        scan.close();
    }
}
