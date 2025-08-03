package Array_Question;

import java.util.Scanner;

 class count_no_greater_x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12,3,54,76,37,80,80,78,97};
        System.out.println("Enter the number ");
        int x = sc.nextInt();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x){
                count++;
            }
        }
        // optional enhnce for Loop
//        for (int j : arr) {
//            if (j > x) {
//                count++;
//            }
//        }

        System.out.println(count);
    }
}
