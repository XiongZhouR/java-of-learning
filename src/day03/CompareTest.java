package day03;

/*


运算符之三：比较运算符 == != > < >= <= instanceof


结论：
1.比较运算符的结果是boolean类型
2.区分 == 和 =
3.==,!= 不仅可以使用在数值类型数据之间，还可以使用在其他引用类型变量之间.
*/
public class CompareTest {
    public static void main(String[] args) {
       
        int i = 10;
        int j = 20;
        System.out.println(i == j); //false
        System.out.println(i = j); //20
        
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b2 == b1); //false
        System.out.println(b2 = b1); //true
        
    }
}
