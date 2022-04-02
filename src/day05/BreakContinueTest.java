package day05;

/*

break: switch-case/循环结构中
循环中使用的作用：结束当前循环

continue：循环结构中
循环中使用的作用：结束当次循环

break;continue的直接后面不可再加执行语句
 */
public class BreakContinueTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 4 == 0) {
                break;//123
                //continue;//123567910
            }
            //System.out.println(i);
        }
        //************ 
        label: for (int i = 1; i <=4; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j % 4 == 0) {
                    //break;//默认跳出包裹此关键字最近的一层循环
                    //continue;
                    // break label;//结束指定标识的一层循环
                    continue label;// 结束指定标识的一层循环当次循环
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
