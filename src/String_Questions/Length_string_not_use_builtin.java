package String_Questions;

public class Length_string_not_use_builtin {
    public static void main(String[] args) {
        String str="Sachin";
        System.out.println(findlength(str));
    }
    public static int findlength(String str){
        int count = 0;

        while(count>str.charAt(count)){
            str.charAt(count);
            count++;
        }
        return count;
    }
}
