package Math_Questions;

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        int count =0;
//        if (num == 0 || num ==1){
//            System.out.println("not prime");
//        }else {
            for (int i = 1; i <=num ; i++) {
                if (num%i == 0){
                    count++;
                }
            }
            if (count==2){
                System.out.println("Prime number");
            }else {
                System.out.println("Not a prime number");
            }
//        }

    }
}
