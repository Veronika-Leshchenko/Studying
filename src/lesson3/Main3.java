package lesson3;

public class Main3 {
    public static void main(String[] args) {
        String text = "У меня все хорошо, замечательно, у меня все - получается!";

        char[] charsFromText = text.toCharArray(); // преобразовывает текстовую переменную в массив

        for (int i = 0; i < charsFromText.length; i++) {
            if (charsFromText[i] == ',' || charsFromText[i] == '-' || charsFromText[i] == '!') {
                System.out.print(' ');

            } else {
                System.out.print(charsFromText[i]);
            }


        }

    }

}


