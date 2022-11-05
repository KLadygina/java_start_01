package string_array_l1;

public class Task3 {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int space = s.length() - 1;
        while (space >= 0) {
            if (s.charAt(space) == ' ') {
                space--;
                continue;
            }
            int letter = space - 1;
            while (letter >= 0 && s.charAt(letter) != ' ') {
                letter--;
            }
            sb.append(" ");
            sb.append(s.substring(letter + 1, space + 1));
            space = letter - 1;
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}
