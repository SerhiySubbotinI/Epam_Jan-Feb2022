package com.epam.rd.autotasks.meetanagent;

import java.util.Scanner;

public class MeetAnAgent {
    final static int password = 133976;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        if (number == password)
            System.out.println("Hello, Agent");
        else
            System.out.println("Access denied");
    }
}
