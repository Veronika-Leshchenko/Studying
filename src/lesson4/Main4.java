package lesson4;

public class Main4 {
    public static void main(String[] args) {
        char [] qwer = {'q', 'w', 'e', 'r'};
        char [] tyui = {'t','y', 'u', 'i'};

        char [] qwertyui = new char[qwer.length + tyui.length];

        for(int i = 0; i < qwertyui.length; i++){
            if (i < qwer.length) {
                qwertyui[i] = qwer[i];
            }else {
                qwertyui[i] = tyui[i - qwer.length];
            }
            System.out.print(qwertyui[i]);

        }

    }
}
