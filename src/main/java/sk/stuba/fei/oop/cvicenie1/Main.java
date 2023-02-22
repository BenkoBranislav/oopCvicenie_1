package sk.stuba.fei.oop.cvicenie1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadaj čísla: ");
        int cisloJedna = Integer.parseInt(scanner.nextLine());
        int cisloDva = Integer.parseInt(scanner.nextLine());

        System.out.println(pocitanie(cisloJedna, cisloDva));

    }
    public static int pocitanie(int cisloJedna, int cisloDva){
        if (cisloJedna > cisloDva){
            return 1;
        }
        if (cisloJedna < cisloDva){
            return -1;
        }
        return 0;
    }
}
