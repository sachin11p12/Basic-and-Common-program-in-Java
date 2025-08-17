package String_Questions;

public class Remove_duplicate_character {
    public static void main(String[] args) {
        String str = "ssaacchin";
        System.out.println(remove_duplicate(str));
    }
    public static String remove_duplicate(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int count =0;
            if (str.charAt(i) != ' '){
                for (int j = i+1; j<str.length(); j++){
                    if (str.charAt(i) == str.charAt(j) &&  (i!=j)){
                        count++;
                    }
                }
                if(count == 0){  // this give all character one time
                    result += str.charAt(i);
                }
//                if(count == 1){//   this will give the character which have more that one time occurance
//                    result += str.charAt(i);
//                }
            }
        }
        return result;
    }
}
