package com.strings;

public class StringOperations {
    public static void main(String[] args) {
        System.out.println(solve("aeiOUz"));
        System.out.println(solve2("aeiOUz"));
        // String Builder is faster than String
        System.out.println(solve3("aeiOUz"));
    }

    // O(n) time complexity
    public static String solve(String A) {

        String concat = A + A;
        String temp = "";
        for(int i=0;i<concat.length();i++){
            if(!((concat.charAt(i) >= 'A') && (concat.charAt(i) <= 'Z'))){
                temp += concat.charAt(i);
            }
        }

        String result = "";

        for(int i=0;i<temp.length();i++) {

            if(temp.charAt(i)== 'a'
                    || temp.charAt(i)== 'e'
                    || temp.charAt(i)== 'i'
                    || temp.charAt(i)== 'o'
                    || temp.charAt(i)== 'u') {

                result += '#';
            } else {
                result += temp.charAt(i);
            }

        }


        return result;


    }

    // O(n) time complexity
    public static String solve2(String A) {

        String concat = A + A;
        String temp = "";
        for(int i=0;i<concat.length();i++){
            if(!((concat.charAt(i) >= 'A') && (concat.charAt(i) <= 'Z'))){

                if(concat.charAt(i)== 'a'
                        || concat.charAt(i)== 'e'
                        || concat.charAt(i)== 'i'
                        || concat.charAt(i)== 'o'
                        || concat.charAt(i)== 'u') {

                    temp += '#';
                } else {
                    temp += concat.charAt(i);
                }
            }
        }

        return temp;
    }

    public static String solve3(String A) {

        String concat = A + A;
        StringBuilder res = new StringBuilder();
        for(int i=0;i<concat.length();i++){
            if(!((concat.charAt(i) >= 'A') && (concat.charAt(i) <= 'Z'))){

                if(concat.charAt(i)== 'a'
                        || concat.charAt(i)== 'e'
                        || concat.charAt(i)== 'i'
                        || concat.charAt(i)== 'o'
                        || concat.charAt(i)== 'u') {

                    res.append('#');
                } else {
                    res.append(concat.charAt(i));
                }
            }
        }

        return res.toString();
    }
}
