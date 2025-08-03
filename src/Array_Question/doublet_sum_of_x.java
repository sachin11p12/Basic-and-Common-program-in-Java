package Array_Question;

public class doublet_sum_of_x {
    public static void main(String[] args) {
        int[] arr = {2,4,7,9,4,2,33,21,8};
        int x =13;
        finddoubletsun(arr, x);
    }
    static void finddoubletsun(int [] arr, int targetSum){
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]+arr[i+1] == targetSum){
                System.out.println(arr[i]+","+arr[i+1]);
                return;
            }
        }
        System.out.println("No doublet found with "+targetSum);
    }
}
