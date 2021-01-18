package lesson1;

public class Modul1 {
    public static void main(String[] args) {

        double table_width = 1;
        double table_length = 0.5;
        double room_width = 3;
        double room_length = 4;

        double square_table = table_width * table_length;
        double square_room = room_width * room_length;

        double number_tables = square_room / square_table;
        System.out.println(number_tables);


    }

}
