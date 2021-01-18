package lesson4;

public class Main6 {
    public static void main(String[] args) {
        String password = "sdfgннннннннн";

        if (password.length() < 8) {
            System.out.println("Слабый пароль");
            return; // как выйти. Остановка точки старта
        }
        char[] chars = password.toCharArray(); // преобразователь в массив символов, в круглые скобки ничего не вписываем
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0' || chars[i] == '1' || chars[i] == '2' || chars[i] == '3' || chars[i] == '4'
                    || chars[i] == '5' || chars[i] == '6'
                    || chars[i] == '7' || chars[i] == '8' || chars[i] == '9') {
                System.out.println("Сильный пароль");
                return; // не даст спуститься ниже цикла for и дальше код не будет работать
            }

        }
        System.out.println("Средний пароль");
    }
}
// если слово ретерн заменить словом брейк, то слово брейк обрывает первый внешний цикл, и тогда у нас будет две надписи и сильный пароль и средний