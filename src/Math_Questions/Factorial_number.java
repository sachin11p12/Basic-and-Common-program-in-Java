package Math_Questions;

import java.util.Scanner;

public class Factorial_number {
    public static void main(String[] args) {
//      Factorial of n = n * (n-1) * (n-2) * ... * 1
//      Example: 5! = 5 × 4 × 3 × 2 × 1 = 120

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();

        long fact = 1;
        for (int i = 1; i <=num ; i++) {
            fact = fact*i;
        }
        System.out.println("factorialof"+num +" is "+ fact);
    }
}
