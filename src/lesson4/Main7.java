package lesson4;

public class Main7 {
    public static void main(String[] args) {
        char[] abcd = {'a', 'b', 'c', 'd'};
        char[] qwer = {'q', 'w', 'e', 'r'};
        String sentence = "Are you ready to start studying of programming?";

        char[] charsFromSentence = sentence.toLowerCase().toCharArray(); // преобразовываем точкой и методом из предложения в символы.
        // Если мы хотим преобразовать весь текст в маленькие буквы, то вставляем метод .toLowerCase
//  либо можем написать двумя строчками
        // 1) String sentenceToLowerCase = sentence.toLowerCase();
        // 2) char[] charsFromSentence = sentenceToLowerCase.toCharArray(); - Из предложения в массив символов и все символы с маленькой буквы
        for(int i = 0; i < charsFromSentence.length; i++) { // далее делаем проход по массиву 'a', 'b', 'c', 'd' - а это всегда ещё один цикл, в данном случае цикл в цикле
            char currentCharFromSentence = charsFromSentence[i]; // текущий массив из предложения преобразовываем в массив из предложения [i]
            for (int j = 0; j < abcd.length; j++) {
                char currentCharFromAbcd = abcd[j]; // текущий массив из abcd преобразовываем в новую переменную abcd[i]
                if(currentCharFromSentence == currentCharFromAbcd) { // если текущий массив из предложения приравнять к текущему массиву из abcd
                    charsFromSentence[i] = qwer[j]; //
                }
            }

        }
        String sentenceWithReplaceChars = String.valueOf(charsFromSentence);
        System.out.println(sentenceWithReplaceChars);
    }
}
