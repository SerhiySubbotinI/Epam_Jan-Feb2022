package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        String array[] = number.split(" ");
        int numberOfElements = 0;
        int sum = 0;
        for(int i=0;i<array.length;i++) {
            int n = Integer.parseInt(array[i]);
            if (n == 0) break;
            else {
                sum += n;
                numberOfElements++;
            }
        }
        System.out.println(sum / numberOfElements);
    }

}