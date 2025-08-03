package String_Questions;

public class Reverse {
    public static void main(String[] args) {
        String str = "sachin";
//        for (int i = str.length()-1; i >= 0 ; i--) {
//            System.out.print(str.charAt(i));
//        }
        System.out.println();
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(str).reverse());
    }
}
