package Math_Questions;

import java.util.Scanner;

public class Largest_of_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number : ");
        int a = sc.nextInt();
        System.out.println("Enter the Second number : ");
        int b = sc.nextInt();
        System.out.println(" Enter the third Number");
        int c = sc.nextInt();

        if(a>=b && a>=c){
            System.out.println(a);
        } else if (b>=a && b>=c) {
            System.out.println(b);
        }else {
            System.out.println(c);
        }
    }
}
