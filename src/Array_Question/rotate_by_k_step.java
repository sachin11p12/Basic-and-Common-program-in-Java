package Array_Question;

public class rotate_by_k_step {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int k =3;
        int n = arr.length;
        System.out.println("Original array are : ");
        displayarr(arr);
        rotateByk(arr,k);
        displayarr(arr);

    }
    static void rotateByk(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        reverseArr(arr, 0, n-1);
        reverseArr(arr, 0, k-1);
        reverseArr(arr, k, n-1);
    }
    static void reverseArr(int[] arr, int start, int end){
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void displayarr(int[] arr){
        for (int num : arr){
            System.out.print(num+",");
        }
        System.out.println();
    }
}
