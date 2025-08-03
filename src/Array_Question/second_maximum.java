package Array_Question;

class second_maximum {
    public static void  main(String[] args) {
        int[] arr = {12,3,54,76,37,80,80,78,97};
        int firstmax = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>firstmax){
                secondmax = firstmax;
                firstmax=arr[i];
            } else if (arr[i]>secondmax && arr[i] != firstmax) {
                secondmax= firstmax;
            }
        }
        if (secondmax != Integer.MIN_VALUE){
            System.out.println("Second element is "+ secondmax);
        } else {
            System.out.println("No second largest element found");
        }
    }
}