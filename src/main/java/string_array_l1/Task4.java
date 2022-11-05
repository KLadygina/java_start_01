package string_array_l1;

public class Task4 {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while(start < end){
            while(start < end && !Character.isLetterOrDigit(s.charAt(start))){
                start += 1;
            }

            while(start < end && !Character.isLetterOrDigit(s.charAt(end))){
                end -= 1;
            }

            char startChar = Character.toLowerCase(s.charAt(start));
            char endChar = Character.toLowerCase(s.charAt(end));

            if(startChar != endChar){
                return false;
            }
            start += 1;
            end -= 1;
        }
        return true;
    }
}
