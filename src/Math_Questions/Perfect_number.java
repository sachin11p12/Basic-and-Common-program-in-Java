package Math_Questions;

import java.util.Scanner;

public class Perfect_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
//      A number is perfect if the sum of its proper divisors (excluding itself) equals the number.

        int sum =0;
        for (int i = 1; i <num ; i++) {
            if (num%i==0){
                sum +=i;
            }
        }
        if(sum==num){
            System.out.println("Perfect munber");
        }else {
            System.out.println("Not a perfect number");
        }
    }
}