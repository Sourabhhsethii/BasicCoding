package com.oca.training.udemy.array;

public class MultidimensionalArrays {

    public static void main(String[] args) {
        // 1d array
        int[] myArray = new int[] {0,1};

        //2d Array
        int[][] array = new int[2][4]; // 2 Row & 4 Coluum// Java has row major. First will be row.
        int anotherArray[][] =  new int[2][4];

        int[] myIntArray[] = new int[2][4];

        String[][] my2dArray = new String[][]{
                {"one", "Two"}, // 1st row 2 elemets
                {"three", "four", "Five"},
                null
        };

        int[][] numberTable = new int[2][3];
        numberTable[0][0] = 1;
        numberTable[0][1] = 2;
        numberTable[0][2] = 3;
       // numberTable[0][3] = 4; // Out of bound array

        // 3d Arrays
        // pages(planes), row, columns
        int[][][] threeArrays = new int[3][3][3];
        int oneMoreThreeArray[][][] = new int[3][4][4];

        int [][][][] threeDarray = {
                {{{1,2,3}},
                {{4,5,6}},
                {{7,8,9}}},
                {{{1,2,3}},
                        {{4,5,6}},
                        {{7,8,9}}},
                {{{1,2,3}},
                        {{4,5,6}},
                        {{7,8,9}}}
        };


    }
}
