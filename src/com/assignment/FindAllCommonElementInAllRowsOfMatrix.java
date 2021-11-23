package com.assignment;

import java.util.*;

/**
 * Find All Common Element in All Rows of Matrix
 * Given an M x N matrix of integers, find all the common elements that are present in all rows of the given matrix in O(M * N) time.
 *
 * For example, take a look at the matrix given below.
 *
 * 11 12 11 14 18
 *
 * 13 17 18 15 11
 *
 * 18 17 17 13 11
 *
 * 18 11 12 17 19
 *
 * In this matrix, 11 and 18 appear in each row. Hence, 11 and 18 will be the common elements that are present in each row.
 */
public class FindAllCommonElementInAllRowsOfMatrix {
    public static void printElementInAllRows(int mat[][]) {

        int row = mat.length;
        int col = mat[0].length;

        Map<Integer,Integer> mp = new HashMap<>();
        for(int j=0;j<col;j++){
            mp.put(mat[0][j],1);
        }

        ArrayList<Integer> result= new ArrayList<>();

        for(int i=1;i<row;i++){
            for(int j=0;j<col;j++){
                if(mp.get(mat[i][j])!= null && mp.get(mat[i][j])==i){
                    mp.put(mat[i][j],i+1);

                    // Last row add number in result array list.
                    if(i == row-1)
                        result.add(mat[i][j]);
                }
            }
        }

        Collections.sort(result);
        for (int i=0;i<result.size();i++){
            System.out.print( result.get(i) + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        printElementInAllRows(matrix);
    }
}
