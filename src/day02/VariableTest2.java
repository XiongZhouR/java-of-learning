package day02;
/*
基本数据类型之间的运算规则:

前提:只讨论7种基本数据类型的转换,不包含boolean

1.自动类型的转换:
byte char short --> int -->long --> float --> double
容量小的数据类型和容量大的数据类型做运算时,结果自动提升为容量大的数据类型
特别的:当byte char short三种变量做运算时,结果为int

2.强制类型转换:




说明:此时的容量大小指的是表示数的范围大小.
*/
public class VariableTest2 {
    public static void main(String[] args) {
        byte b1 = 2;
        int i1 = 12;
        // byte 和 int 做运算时 至少用 int 来接收;
        int i2 = b1 + i1;
        System.out.println(i2);

        float f = b1 + i1;
        System.out.println(f);

        char c1='a';
        short s2= 10;
        //char c2= c1 + s2; 编译不通过
        int i3 =c1+s2; //char 和 short  做运算时 用 int 来接收
        System.out.println(i3);

    }
}
