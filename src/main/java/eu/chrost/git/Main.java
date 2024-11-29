package eu.chrost.git;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Paulina");
        System.out.println("QWERTY");
        System.out.println("Zmiana GIT");
        System.out.println("Zmiana Intelij");

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();

        Random random = new Random();
        int value = random.nextInt(100);
        System.out.println(value);
    }
}
