package day05;

/*
100以内的素数输出。
素数：只能被1和他本身整除的自然数，最小的素数是：2

对PrimeTest.java文件的方法优化

*/
public class PrimeTest2 {
    public static void main(String[] args) {

        int count = 0;
        // 获取当前时间距离1970年0时0分0秒的毫秒数
        long start = System.currentTimeMillis();

        label: for (int i = 2; i <= 100000; i++) {// 遍历100000以内的自然数
            for (int j = 2; j <= Math.sqrt(i); j++) {// j：被i除
                if (i % j == 0) {// i 被 j 除尽
                    continue label;
                }
            }
            // 能执行到此步骤的，都是素数
            count++;
        }

        long end = System.currentTimeMillis();
        System.out.println("素数的个数为：" + count);
        System.out.println("所花费的时间为：" + (end - start));
    }

}