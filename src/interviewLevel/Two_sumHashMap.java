package interviewLevel;

import java.util.HashMap;

public class Two_sumHashMap {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,6,7};
        int target = 8;
        System.out.println(two_Summ(arr,8));
    }
    public static boolean two_Summ(int [] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int sum = target -arr[i];
            if (map.containsKey(sum)){
                return true;
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return false;
    }
}
