package Array_Question;

class copy_arr_reverse_order {
    public static void main(String[] args) {
        int[] arr = {2,4,7,9,4,2,33,21,8};

        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length-1-i];
        }
        System.out.println("Original Array are ");
        displayArray(arr);
        System.out.println("Reversed array are : ");
        displayArray(newArr);
    }
    static void displayArray(int[] arr){
        for (int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
