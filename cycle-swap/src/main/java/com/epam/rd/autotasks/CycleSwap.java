package com.epam.rd.autotasks;

import java.util.Arrays;

class CycleSwap {
    static void cycleSwap(int[] array) {
        if(array.length > 0) {
        int shift = 1;
        int[] temp = new int[array.length];
        System.arraycopy(array, array.length-shift, temp, 0, shift);
        System.arraycopy(array, 0, temp, shift, array.length - shift);
        System.arraycopy(temp, 0, array, 0, temp.length);
        array = temp;
            System.out.println(Arrays.toString(array));}
        else System.out.println(Arrays.toString(array));
    }

    static void cycleSwap(int[] array, int shift) {
        if(array.length > 0 && shift > 0) {
            int[] temp = new int[shift];
            System.arraycopy(array, (array.length - shift), temp, 0, shift);
            System.arraycopy(array, 0, array, shift, array.length - shift);
            System.arraycopy(temp, 0, array, 0, temp.length);
            array = temp;
            System.out.println(Arrays.toString(array));
        }
        else System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 7, 4};
        CycleSwap.cycleSwap(array);
        CycleSwap.cycleSwap(array,3);
        System.out.print(Arrays.toString(array));
    }
}