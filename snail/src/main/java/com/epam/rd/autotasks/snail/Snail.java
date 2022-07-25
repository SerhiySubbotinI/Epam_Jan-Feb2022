package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int day = keyboard.nextInt();
        int night = keyboard.nextInt();
        int tree = keyboard.nextInt();
        if (day >= tree) System.out.println(1);
        else {
            if (((day - night) <= 0) || (tree == 0)) {
                System.out.println("Impossible");
            } else {
                System.out.println(Math.round((tree - day) / (day - night)) + 1);
            }
        }
    }
}
