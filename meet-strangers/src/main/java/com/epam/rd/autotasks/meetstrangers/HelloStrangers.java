package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int num = Integer.parseInt(keyboard.nextLine());
        if (num > 0) {
            String[] str = new String[num];
            for (int i = 0; i < str.length; i++)
                str[i] = keyboard.nextLine();
            for (String s : str) System.out.println("Hello, " + s);
        } else if (num == 0)
            System.out.println("Oh, it looks like there is no one here");
        else
            System.out.println("Seriously? Why so negative?");
    }
}