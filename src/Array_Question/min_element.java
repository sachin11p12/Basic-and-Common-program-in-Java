package Array_Question;

class min_element {
    public static void main(String[] args) {
        int [] arr = {12,21,32,32,4,73,43,92,32};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Minimum element is - "+min);
    }
}
