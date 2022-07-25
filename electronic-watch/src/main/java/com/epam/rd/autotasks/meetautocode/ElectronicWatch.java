package com.epam.rd.autotasks.meetautocode;

import java.time.LocalTime;
import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        LocalTime time = LocalTime.ofSecondOfDay(seconds%86400);
        System.out.printf("%01d:%02d:%02d",time.getHour(),time.getMinute(),time.getSecond());
    }
}
