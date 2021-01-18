package lesson6;

public class StringUtils {
    public static String getReverse(String text) {
        StringBuilder builder = new StringBuilder(text);
        return builder.reverse().toString();
    }

    public static int isVowel(String text) {
        int vcount = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vcount++;
            }
        }
        return vcount;
    }

    public static int consonant(String text) {
        int ccount = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                ccount++;
            }
        }
        return ccount;
    }
}






