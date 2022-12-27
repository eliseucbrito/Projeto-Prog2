package gui;


import colors.Color;
import data.Key;
import data.Reserve;
import data.Teacher;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class app {

    // presets
    static String tableFormatReserve = "%-8s %-15s %-10s %-8s %-10s %-8s%n";
    static String tableFormatTeacher = "%-10s %-15s %-12s %n";
    static String tableFormatKey = "%-8s %-15s %n";

    static String enterID= Color.GREEN_BOLD+"Digite o ID: "+Color.RESET;
    static String enterSIAPE= Color.GREEN_BOLD+"Digite o SIAPE: "+Color.RESET;
    static String enterKey= Color.GREEN_BOLD+"Digite o número da chave: "+Color.RESET;

    // color + background
    static String successOp = Color.GREEN_BACKGROUND+"Operação realizada com sucesso"+Color.RESET;
    static String invalidOp = Color.RED_BACKGROUND+"Invalid option!"+Color.RESET;

    // max teachers, keys and reserves.
    private static final int MAX = 100;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op;
        String newValue;
        Reserve re = new Reserve();
        Teacher te = new Teacher();
        Key key = new Key();

        do {
            System.out.print(Color.GREEN_BOLD);
            System.out.println("================================");
            System.out.println("0 - Exit");
            System.out.println("1 - Register (Teacher)");
            System.out.println("2 - Register (Key)");
            System.out.println("3 - Register (Reserve)");
            System.out.println("==============================");
            System.out.println("4 - Remove (Teacher)");
            System.out.println("5 - Remove (Key)");
            System.out.println("6 - Remove (Reserve)");
            System.out.println("==============================");
            System.out.println("7 - Change (Teacher)");
            System.out.println("8 - Change (Key)");
            System.out.println("9 - Change (Reserve)");
            System.out.println("==============================");
            System.out.println("10 - Consult (Teacher)");
            System.out.println("11 - Consult (Key)");
            System.out.println("12 - Consult (Reserve)");
            System.out.println("==============================");
            System.out.println("13 - List (Teacher)");
            System.out.println("14 - List (Key)");
            System.out.println("15 - List (Reserves)");
            System.out.print(Color.RESET);
            System.out.print(Color.BLUE_BOLD + "Enter your option: " + Color.RESET);
            op = input.nextInt();
            input.nextLine();

            switch (op) {
                case 0:
                    System.out.println(Color.WHITE_BOLD + "Saindo...");
                    break;
                case 1: // insert

            }

        } while (op!=0);
    }
}
