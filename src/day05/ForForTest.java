package day05;

/*
嵌套循环的使用

*/
public class ForForTest {
    public static void main(String[] args) {

        /*
        
        *
        **
        ***
        ****
        *****
        */
        for (int j = 1; j <= 5; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        
    }
}
