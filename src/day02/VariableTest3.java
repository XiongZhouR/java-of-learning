package day02;
/*
强制类型转换:自动类型转换的逆运算
1.需要使用强转符
2.可能导致精度损失
 */
public class VariableTest3 {
    public static void main(String[] args) {
        double d1=12.9;

        int i1 = (int) d1; //强制类型转换 ,截断操作

        System.out.println(i1);

        //没有精度损失
        long l1=123l;
        short s2 = (short) l1;
        System.out.println(s2);



    }
}
