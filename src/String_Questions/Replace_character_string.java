package String_Questions;

import java.util.Scanner;

public class Replace_character_string {
    public static void main(String[] args) {
//        String str = "sachin tiwari is here";
//        char ch1 = 'i';
//        char ch2 = 'o';
//        String updated = str.replace(ch1,ch2);
//        System.out.println(updated);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the original string: ");
        String str = sc.nextLine();

        System.out.print("Enter the character to replace: ");
        char oldChar = sc.next().charAt(0);

        System.out.print("Enter the new character: ");
        char newChar = sc.next().charAt(0);

        String updatedStr = str.replace(oldChar, newChar);

        System.out.println("Updated string: " + updatedStr);

    }
}
