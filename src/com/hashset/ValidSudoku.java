package com.hashset;

import java.util.HashSet;

/**
 * Determine if a Sudoku is valid, according to: http://sudoku.com.au/TheRules.aspx
 *
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 *
 * ["53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"]
 */
public class ValidSudoku {

    public static void main(String[] args) {
        String[] A = {"..5.....6",
                      "....14...",
                      ".........",
                      ".....92..",
                      "5....2...",
                      ".......3.",
                      "...54....",
                      "3.....42.",
                      "...27.6.."};
        String[] B = {  "....5..1.",
                        ".4.3.....",
                        ".....3..1",
                        "8......2.",
                        "..2.7....",
                        ".15......",
                        ".....2...",
                        ".2.9.....",
                        "..4......"};
        System.out.println(isValidSudoku(B));
    }

    public static int isValidSudoku(final String[] A) {

        for(int i=0;i<A.length;i++){
            HashSet<Character> hs = new HashSet<Character>();
            for(int j=0; j<A[i].length();j++){
                if(!(A[i].charAt(j)=='.')){
                    if(hs.contains(A[i].charAt(j))){
                        return 0;
                    } else {
                        hs.add(A[i].charAt(j));
                    }
                }
            }
        }

        for(int i=0;i<A[0].length();i++){
            HashSet<Character> hs = new  HashSet<Character>();
            for(int j=0; j<A.length;j++){
                if(!(A[j].charAt(i)=='.')){
                    if(hs.contains(A[j].charAt(i))){
                        return 0;
                    } else {
                        hs.add(A[j].charAt(i));
                    }
                }
            }
        }
        HashSet<Character> hs = null;
        hs = new  HashSet<Character>();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(!(A[i].charAt(j)=='.')){
                    if(hs.contains(A[i].charAt(j))){
                        return 0;
                    } else {
                        hs.add(A[i].charAt(j));
                    }
                }
            }
        }

        hs = new  HashSet<Character>();
        for(int i=0;i<3;i++){
            for(int j=3;j<6;j++){
                if(!(A[i].charAt(j)=='.')){
                    if(hs.contains(A[i].charAt(j))){
                        return 0;
                    } else {
                        hs.add(A[i].charAt(j));
                    }
                }
            }
        }

        hs = new  HashSet<Character>();
        for(int i=0;i<3;i++){
            for(int j=6;j<9;j++){
                if(!(A[i].charAt(j)=='.')){
                    if(hs.contains(A[i].charAt(j))){
                        return 0;
                    } else {
                        hs.add(A[i].charAt(j));
                    }
                }
            }
        }

        hs = new  HashSet<Character>();
        for(int i=3;i<6;i++){
            for(int j=0;j<3;j++){
                if(!(A[i].charAt(j)=='.')){
                    if(hs.contains(A[i].charAt(j))){
                        return 0;
                    } else {
                        hs.add(A[i].charAt(j));
                    }
                }
            }
        }

        hs = new  HashSet<Character>();
        for(int i=3;i<6;i++){
            for(int j=3;j<6;j++){
                if(!(A[i].charAt(j)=='.')){
                    if(hs.contains(A[i].charAt(j))){
                        return 0;
                    } else {
                        hs.add(A[i].charAt(j));
                    }
                }
            }
        }

        hs = new  HashSet<Character>();
        for(int i=3;i<6;i++){
            for(int j=6;j<9;j++){
                if(!(A[i].charAt(j)=='.')){
                    if(hs.contains(A[i].charAt(j))){
                        return 0;
                    } else {
                        hs.add(A[i].charAt(j));
                    }
                }
            }
        }

        hs = new  HashSet<Character>();
        for(int i=6;i<9;i++){
            for(int j=0;j<3;j++){
                if(!(A[i].charAt(j)=='.')){
                    if(hs.contains(A[i].charAt(j))){
                        return 0;
                    } else {
                        hs.add(A[i].charAt(j));
                    }
                }
            }
        }

        hs = new  HashSet<Character>();
        for(int i=6;i<9;i++){
            for(int j=3;j<6;j++){
                if(!(A[i].charAt(j)=='.')){
                    if(hs.contains(A[i].charAt(j))){
                        return 0;
                    } else {
                        hs.add(A[i].charAt(j));
                    }
                }
            }
        }

        hs = new  HashSet<Character>();
        for(int i=6;i<9;i++){
            for(int j=6;j<9;j++){
                if(!(A[i].charAt(j)=='.')){
                    if(hs.contains(A[i].charAt(j))){
                        return 0;
                    } else {
                        hs.add(A[i].charAt(j));
                    }
                }
            }
        }


        return 1;

    }
}
