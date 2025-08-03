package Math_Questions;

import java.util.Scanner;

public class Palindrome_number {
    public static void main(String[] args) {
//      A number is palindrome if it reads the same forward and backward.
//      Example: 121, 1331 are palindromes

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        int original = num;
        int reverse = 0;

        while (num!=0){
            int digit = num%10;
            reverse = reverse * 10 + digit;
            num = num/10;
        }
        if (reverse==original){
            System.out.println("Palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
}
