package interviewLevel;

import java.util.Arrays;

public class Move_zero_end {
    public static void main(String[] args) {
        int [] nums = {0,4,3,0,6,0};
        int[] result=moves(nums);
        System.out.println(Arrays.toString(result));
    }
    public static int[] moves(int[] arr){
        int left =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                int temp = arr[left];
                arr[left] = arr[i];
                arr[i] = temp;
                left++;
            }
        }
        return arr;
    }
}
