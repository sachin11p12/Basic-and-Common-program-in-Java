package String_Questions;

public class count_no_of_word {
    public static void main(String[] args) {
        String str = "I am Sachin Tiwari ! How about you ";
        str.trim();
        if (str.isEmpty()){
            System.out.println("Word count : 0");
        }else {
            String[] words = str.split("\\s+");  // [ \\s+ ] this means one or more space or tabs so it help even user typed extra spaces
            System.out.println("Word count : "+ words.length);
        }
    }
}
