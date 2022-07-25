package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(keyboard.next());
        int numberOfPiecesPerPizza = Integer.parseInt(keyboard.next());
        int x = 0;
        do {
            x++;
        } while ((x * numberOfPiecesPerPizza) % numberOfPeople != 0);
        System.out.println(x);
    }
}
