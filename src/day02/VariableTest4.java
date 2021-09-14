package day02;
public class VariableTest4 {
    public static void main(String[] args) {

        //编码情况1
        long l1=123313;
        System.out.println(l1);

        //编译不通过,超出范围
        //long l2 =214123333333333358;
        //long l2 =214123333333333358L;

        //编译失败
        //float f1=12.3;
        //float f1=12.4f;

        //编码情况2
        //整型常量,默认类型为int型
        //浮点型常量,默认类型为double型
        //byte b =12;
        
        //byte b1= b+1; 编译失败
        
        //float f1 = b + 12.3; 编译失败
    }
}
