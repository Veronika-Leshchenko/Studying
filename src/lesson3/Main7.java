package lesson3;

public class Main7 {
    public static void main(String[] args) {
        String text = "У меня все хорошо, замечатльно, у меня все - получается!";

        char[] charsFromText = text.toCharArray(); // .toCharArray -метод, как преобразовать из текста в массив

        for (int i = 0; i < charsFromText.length; i++) {
            if (charsFromText[i] == ',' || charsFromText[i] == '-' || charsFromText[i] == '!') {
                charsFromText[i] = ' ';
//            } else {
//                System.out.print(charsFromText[i]);
            }
        }
        String textWithout = String.valueOf(charsFromText);// Цикл фор закончился, и в этом месте весь текст уже преобразован, он без запятых, тире, и воскл.знака
        System.out.println(textWithout);
    }


}
// String.valueOf(charsFromText) - метод, как обратно преобразовать из массива в текст