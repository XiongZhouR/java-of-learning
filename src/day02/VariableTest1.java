package day02;


/*
java定义的数据类型:
一.变量按照数据类型来分
基本数据类型:
    整型:byte(1字节 -128~127) / short(2字节) / int(4字节) / long(8个字节)
    浮点型:float(4字节) / double(8字节)
    字符型:char(1字符=2字节)
    布尔型:boolean
引用数据类型:
类(class)
接口(interface)
数组(array)
*/
class VariableTest1 {
    public static void main(String[] args) {
        //一.整型
        byte b1=12;
        byte b2=-127;
        System.out.println(b1);
        System.out.println(b2);
        //声明long型变量必须以大写或者小写L结尾
        long L1=121334L;
        System.out.println(L1);

        //二.浮点型
        //①浮点型:表示带小数点的数值
        //②float表示的数值比int的范围还要大
        //③定义float变量类型时要以f或者F结尾
        //④通常定义浮点型用double
        float f1=123.4f;
        System.out.println(f1);

        //三.字符型
        //定义字符型通常使用'',内部只能写一个字符,可以是不同的语言文字
        //转义字符
        char c1='A';
        System.out.println(c1);

        char c2='\n';
        System.out.print("Hello"+c2);
        System.out.println("World");

        //四.布尔类型 boolean
        boolean bl1=true;
        System.out.println(bl1);
    }
}
