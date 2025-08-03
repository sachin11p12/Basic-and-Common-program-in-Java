package String_Questions;

import java.awt.*;

public class remove_all_white_space {
    public static void main(String[] args) {
        String str = "I am Sachin Tiwari ! How about you ";
        String result = str.replaceAll("\\s","");
        System.out.println(result);
    }
}
