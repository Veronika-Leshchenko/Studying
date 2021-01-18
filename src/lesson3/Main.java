package lesson3;

public class Main
{
    public static void main(String[] args) {
        char[] qwer = {'q', 'w', 'e', 'r'};
        char[] tyui = {'q', 'w', 'e', 'r'};

        char[] qwertyui = new char[qwer.length + tyui.length];
        for(int i = 0; i < qwertyui.length; i++) {
            if (i < qwer.length) {
                qwertyui[i] = qwer[i];
            }else {
                    qwertyui[i] = tyui [i - qwer.length];

            }
            System.out.print(qwertyui[i]);
        }

    }
}
