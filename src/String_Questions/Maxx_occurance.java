package String_Questions;

public class Maxx_occurance {
    public static void main(String[] args) {
        String str = "Sachin Tiwari nagnathpurwa";
        System.out.println(count_maximum_char(str));
    }
    public static String count_maximum_char(String str){
        String result = "";
        int c =0;
        int max =0;
        for (int i = 0; i < str.length(); i++) {
            int count =1;
            if (str.charAt(i) != ' '){
                for (int j = i+1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j) && i!=j){
                        count++;
                    }
                }
                if (max<count){
                    max=count;
                    result += str.charAt(i);
                }
            }
        }
        return result;
    }
}
