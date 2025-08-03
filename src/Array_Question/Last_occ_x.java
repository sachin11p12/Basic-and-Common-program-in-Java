package Array_Question;

import java.util.ArrayList;
import java.util.List;

public class Last_occ_x {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,2,1,5,1,6));
        int secondOccurance = -1;
        int x = 1;
        for (int i =list.size()-1;i>=0;i--){
            if (list.get(i)==x){
                secondOccurance = i;
                break;
            }
        }
        if (secondOccurance != -1){
            System.out.println(" Last occurance of selected no is : "+secondOccurance);
        }else {
            System.out.println("Not found");
        }
        System.out.println(list.indexOf(1));
    }
}
