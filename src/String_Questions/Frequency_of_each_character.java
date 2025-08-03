package String_Questions;

import java.util.HashMap;

public class Frequency_of_each_character {
    public static void main(String[] args) {
        String str = "I am Sachin Tiwari ! what About you ";
//        str.trim().toLowerCase().replaceAll("\\s", "");
        String result = str.replaceAll("\\s","");
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char ch : result.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
        }
        System.out.println("Character frequencies : ");

        for (char ch : freq.keySet()){
            System.out.println(ch +"--->"+ freq.get(ch));
        }
    }
}
