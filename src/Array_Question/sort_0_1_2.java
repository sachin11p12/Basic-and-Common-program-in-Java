package Array_Question;

public class sort_0_1_2 {
    public static void main(String[] args) {
        int [] arr = {2,1,0,1,0,0,0,1,2,1,2};
        display(arr);
        moves(arr);
        display(arr);
    }
    static void moves(int[] arr){
        int low =0;
        int high = arr.length-1;
        int i =0;
        while (i<=high){
            if (arr[i]==0){
                swap(arr,i, low);
                i++;
                low++;
            } else if (arr[i]==2) {
                swap(arr, i, high);
                high--;
            }else {
                i++;
            }
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void display(int[] arr){
        for (int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
