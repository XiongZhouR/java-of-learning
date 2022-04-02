package day05;

/*
100以内的素数输出。
素数：只能被1和他本身整除的自然数，最小的素数是：2

对PrimeTest.java文件的方法优化

*/
public class PrimeTest1 {
    public static void main(String[] args) {
        boolean isFlag = true;// 标识i是否被j除尽，一旦除尽就修改其值

        // 获取当前时间距离1970年0时0分0秒的毫秒数
        long start = System.currentTimeMillis();

        for (int i = 2; i <= 100; i++) {// 遍历100以内的自然数

            // 优化二：针对于对本身是素数的自然数是有效的。
            for (int j = 2; j <= Math.sqrt(i); j++) {// j：被i除
                if (i % j == 0) {// i 被 j 除尽
                    isFlag = false;
                    break; // 优化一：只对本身是非素数的自然数是有效的。
                }
            }
            if (isFlag == true) {
                System.out.println(i);
            }
            // 重置isFlag
            isFlag = true;
        }

        long end = System.currentTimeMillis();
        System.out.println("所花费的时间为：" + (end - start));
    }

}