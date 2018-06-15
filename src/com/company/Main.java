package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Загадайте число от 0 до 100");
        int lower = 0;
        int higher = 100;

        do {
            int mid = lower + (higher - lower) / 2;
            System.out.print("Загаданное вами число больше или равно " + mid + "? ");
            String ans = in.nextLine();
            if (ans.equals("да") || ans.equals("д")
                    || ans.equals("y") || ans.equals("yes")) {
                lower = mid;
            } else {
                higher = mid;
            }
        } while (lower != higher); // исправить алгоритм
        System.out.println("Вы загадали число " + lower);
    }
}
