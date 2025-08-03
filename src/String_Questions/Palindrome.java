package String_Questions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
//      A number is prime if it's greater than 1 and has only 2 factors: 1 and itself.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the String : ");
        String str = sc.nextLine();
        String org = str;
        String rev = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            rev = rev+str.charAt(i);
        }
        if (org.equals(rev)){
            System.out.println("Palindrome String "+org);
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
