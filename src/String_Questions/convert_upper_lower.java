package String_Questions;

import java.util.Scanner;

public class convert_upper_lower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String  : ");
        String str = sc.nextLine();
        System.out.println("Uppercase :"+str.toUpperCase());
        System.out.println("Lowercase :"+str.toLowerCase());
    }
}
