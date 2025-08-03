package Array_Question;

public class sort_0_1 {
    public static void main(String[] args) {
      int[] arr = {1,0,0,0,1,0,1,1,0,0,1,1,1};
      display(arr);
      movesZero(arr);
      display(arr);
    }

    static void movesZero(int[] arr){
        int i = 0;
        int j = 0;
        while (i< arr.length){
            if (arr[i] == 0 ){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
    }
    static void display(int[] arr){
        for (int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}