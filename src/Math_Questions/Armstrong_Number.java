package Math_Questions;

import java.util.Scanner;

class Armstrong_Number {
    public static void main(String[] args) {
//      An Armstrong number is a number that is equal to the sum of the cubes of its digits (for 3-digit numbers).
//      Example: 153 → 1³ + 5³ + 3³ = 1 + 125 + 27 = 153

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = sc.nextInt();
        int orgNum = number;  // to save the orginal no.
        int sum =0;
        int digits = String.valueOf(number).length();   //  count the digit
        // now compute the Armstrng sum
        while(number>0){
            int lastDigit = number%10;  // get the last digit
            sum += Math.pow(lastDigit, digits);
            number/=10;  //  to remove the  last digit
        }
        if (sum==orgNum){
            System.out.println("Armstrong number");
        }else {
            System.out.println("Not a Armstrong number");
        }
    }
}
