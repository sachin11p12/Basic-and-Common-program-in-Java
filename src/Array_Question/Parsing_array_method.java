package Array_Question;

class Parsing_array_method {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        modifyarray(arr);
        System.out.println("Modifies array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
    static void modifyarray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]*2;
        }
    }
}
