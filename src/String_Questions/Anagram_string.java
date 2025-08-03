package String_Questions;

import java.util.Locale;

public class Anagram_string {
    public static void main(String[] args) {
            String str1 = "ABCFD";
            String str2 ="fcbau";

            str1 = str1.toLowerCase();
            if(str1.length()!=str2.length()){

                System.out.println("not Anana..");
                return;
            }
             int [] arr = new int[256];
            for(int i = 0;i<str1.length();i++){
                arr[str1.charAt(i)]++;
                arr[str2.charAt(i)]--;
//                char c = str1.charAt(i);
//                arr[c]=arr[c]+1;

            }
//            for(int j = 0;j<str2.length();j++){
//                //arr[str2.charAt(j)]--;
//                char c = str2.charAt(j);
//                arr[c]=arr[c]-1;
//
//
//            }
            for(int k =0;k<arr.length;k++){
                if(arr[k]!=0){
                    System.out.println("Not Anagram");
                    return;
                }
            }
        System.out.println("Anagram");
    }
}
