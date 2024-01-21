package com.assignment;

public class LastOccurrenceString {

    public static void main(String[] args) {
        System.out.println(solve("bvymzikytswvgniflzbyyrkcojuxedcviygnxuckqxmiqtzsqvrvppsnmaoghsxoierzuuecjlxwievsxcesfqsaeg",99));
        System.out.println((char) 99);
    }

    public static int solve(final String A, final int B) {
        int n = A.length();
        int j = 0;
        int result = -1;
        for(int i=n-1; i>=0; i--){
            j = (n-1)-i;
            int ch = (int)A.charAt(i);
            if(ch == B && ch>= 'a' && ch<='z'){
                result = j;
                break;
            }
        }
        return result;
    }

}

