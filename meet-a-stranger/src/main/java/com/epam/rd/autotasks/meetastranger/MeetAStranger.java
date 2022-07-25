package com.epam.rd.autotasks.meetastranger;


import java.util.Scanner;

public class MeetAStranger {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        System.out.println("Hello, ".concat(name));
    }
}
