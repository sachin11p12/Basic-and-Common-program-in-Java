package interviewLevel;

import java.util.Arrays;

public class Move_zero_end_addZerolator {
    public static void main(String[] args) {
        int [] arr = {0,4,3,0,6,0};
        int[] result=zeroo(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] zeroo(int[] nums){
        int index =0;
        //sift non zero aage
        for (int num: nums){
            if (num !=0){
                nums[index++] = num;
            }
        }
        while (index < nums.length){
            nums[index++] =0;
        }
        return nums;
    }
}
