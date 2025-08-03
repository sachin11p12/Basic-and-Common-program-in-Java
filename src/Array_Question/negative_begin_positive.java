package Array_Question;

public class negative_begin_positive {
    public static void main(String[] args) {
        int[] arr = {-1,4,-5,8,9,-3,0};
        display(arr);
        movesnegative(arr);
        display(arr
        );
    }
    static void movesnegative(int[] arr){
        int i=0;
        int j = arr.length-1;
        while (i<=j){
            if (arr[i]<0){
                i++;
            } else if (arr[j]>= 0) {
                j--;
            }else {
                // swap negative at i with positive at j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }
    static void display(int[] arr){
        for (int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
