package day04;

/*
说明:
1.else 结构是可选的
2.针对于条件表达式
 >如果多个条件表达式之间是"互斥"关系(或没有交集的关系)哪个判读和执行语句写在上面和下面都可以
 >如果多个条件表达式之间有交集关系,则考虑清除哪个应该放在上面
 >如果多个条件表达式之间有包含关系,通常情况下,需要将范围小的声明在范围大的上面.否则,范围晓得就没机会执行

*/
import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生的成绩(1-100)");
        int score = scan.nextInt();

        if (score == 100) {
            System.out.println("奖励一台BMW");
        } else if (score > 80 && score <= 90) {
            System.out.println("奖励一台iphone");
        } else if (score >= 60 && score <= 80) {
            System.out.println("奖励一台ipad");
        }
        scan.close();

    }
}
