package Math_Questions;

import java.util.Scanner;

public class fibonicci_upto_N {
    public static void main(String[] args) {
//      Fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13,...
//      Each term = sum of previous two terms

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();

        int a =0, b =1;
        System.out.print(a+", "+ b+", ");
        for (int i = 2; i <num ; i++) {
            int c = a+b;
            System.out.print(c+", ");
            a=b;
            b=c;
        }
    }
}
