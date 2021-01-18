package lesson6;

public class Main6 {
    public static void main(String[] args) {
        String text = "Hello world!";
        int consonantsInText = StringUtils.consonant(text.toLowerCase());
        System.out.println(consonantsInText);
    }
}
