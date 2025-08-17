package String_Questions;

public class Contain_digit_or_not {
    public static void main(String[] args) {
        String str = "Sachin Tiwari12";
        System.out.println(checkDigit(str));
    }
    public static String checkDigit(String str){
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>='0' && str.charAt(i)<='9'){
                return "Given string contain digit";
            }
        }
        return "Not contains digit";
    }
}
