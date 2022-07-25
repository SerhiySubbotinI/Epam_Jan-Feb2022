package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt(), maximum = number;
        while (true) {
            number = keyboard.nextInt();
            if (number == 0) break;
            if (number > maximum) maximum = number;
        }
        return maximum;
    }


    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        System.out.println(max());
    }
}
