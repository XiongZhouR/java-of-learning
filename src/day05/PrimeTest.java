package day05;

/*
100以内的素数输出。
素数：只能被1和他本身整除的自然数，最小的素数是：2
判断素数的方法
*/
public class PrimeTest {
    public static void main(String[] args) {
        boolean isFlag = true;// 标识i是否被j除尽，一旦除尽就修改其值
        for (int i = 2; i <= 100; i++) {// 遍历100以内的自然数

            for (int j = 2; j <= i - 1; j++) {// j：被i除
                if (i % j == 0) {// i 被 j 除尽
                    isFlag = false;
                }
            }
            if (isFlag == true) {
                System.out.println(i);
            }
            // 重置isFlag
            isFlag = true;
        }
    }

}
