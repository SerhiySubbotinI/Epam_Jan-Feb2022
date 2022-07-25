package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {

        int[][] changeArr(int[][] arr, int n)
        {
            for (int i = 0; i < arr.length; i++)
            {
                for (int j = 0; j < arr.length; j++)
                {
                    if (j < i) arr[i][j] = 0;
                    if (j > i) arr[i][j] = 1;
                }
            }
            return arr;
        }


}
