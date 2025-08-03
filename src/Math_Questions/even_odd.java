package Math_Questions;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
//      A number is even if it's divisible by 2 (i.e., number % 2 == 0)
//      Else, it's odd

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("odd number");
        }
    }
}
