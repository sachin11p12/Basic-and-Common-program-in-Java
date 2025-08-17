package interviewLevel;

import java.util.Arrays;

///  This is Bruite force approach
public class Two_sum_Bruite_Force {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 9};
        int target = 8;
        System.out.println((Arrays.toString(twosum(arr, target))));
    }
    public static int[] twosum(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
