package Math_Questions;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
//      A year is a leap year if:
//      It is divisible by 4, and
//      Not divisible by 100 unless also divisible by 400.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int year = sc.nextInt();
        boolean leap_year = false;
        if ((year%4==0 && year%100 != 0) || (year%400 ==0 )){
            leap_year =true;
        }
        if(leap_year == true){
            System.out.println("Leap year");
        }else {
            System.out.println("Not a leap year");
        }
    }
}
