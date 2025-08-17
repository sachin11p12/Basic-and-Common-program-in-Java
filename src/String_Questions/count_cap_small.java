package String_Questions;

public class count_cap_small {
    public static void main(String[] args) {
        String str = "Sachin Tiwari LUCKNOW";
        System.out.println(noOfCapSmall(str));
    }
    public static String noOfCapSmall(String str){
        int cap =0, small=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!= ' '){
                if (str.charAt(i) >= 'A' && str.charAt(i)<= 'Z'){
                    cap++;
                }else {
                    small++;
                }
            }
        }
        return "capital = " + cap +" \n Small = " + small;
    }
}
