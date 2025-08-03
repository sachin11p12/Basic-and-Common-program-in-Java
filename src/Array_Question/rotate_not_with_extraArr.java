package Array_Question;

public class rotate_not_with_extraArr {
    public static void main(String[] args) {
        int[] arr = {2,4,7,9,4,2,33,21,8};
        System.out.println("Original Array Are : ");
        for (int num : arr){
            System.out.print(num+" ");
        }
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            // just swap the array
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("After reverse ");
        for (int num : arr){
            System.out.print(num+" ");
        }
    }
}
