package Array_Question;

 class max_element {
    public static void main(String[] args) {
        int [] arr = {12,21,32,32,4,73,43,92,32};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element is - "+max);
    }
}
