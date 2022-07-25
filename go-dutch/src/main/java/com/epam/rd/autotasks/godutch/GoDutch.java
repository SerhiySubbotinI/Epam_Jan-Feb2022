package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int price, numberOfFriends;
        price = keyboard.nextInt();
        numberOfFriends = keyboard.nextInt();
        if (price < 0) {
            System.out.println("Bill total amount cannot be negative");
        }
        else if (numberOfFriends <= 0) {
            System.out.println("Number of friends cannot be negative or zero");}
        else {
        System.out.println((int) ((price + price * 0.1) / numberOfFriends));}
    }
}


