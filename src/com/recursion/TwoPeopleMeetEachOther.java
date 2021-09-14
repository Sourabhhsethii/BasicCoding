package com.recursion;
/*
You will be given starting points of two people p1 and p2, respectively, and the distance covered by them in each jump s1 and s2, respectively. You need to find whether they meet after the same number of jumps. The starting points of these two persons should always be different.

Input:
p1: 6
s1: 3
p2: 8
s2: 2
Output:
YES

Explanation:
Person1: 6->9->12
Person2: 8->10->12
They both will meet at point 12 after 2 jumps each
 */
public class TwoPeopleMeetEachOther {

    public static String two_people_meet_each_other(int p1, int s1, int p2, int s2){

        int[] personASteps = new int[20];
        int[] personBSteps = new int[20];

        for(int i=0; i< 20 ;i++){
             p1 = p1 +s1;
            personASteps[i] = p1;
            }

        for (int j=0; j< 20;j++){
            p2 = p2 +s2;
            personBSteps[j] = p2;
        }

        for(int i=0; i< 20 ;i++){
            System.out.print( personASteps[i] + " ");
        }
        System.out.println(" ");
        for(int i=0; i< 20 ;i++){
            System.out.print( personBSteps[i] + " ");
        }

        for(int i=1; i< 20 ;i++){
            for (int j=1; j< 20;j++){
                if(personBSteps[i]== personASteps[j]){
                    System.out.println( " i= " + personASteps[i]  + " j ="  + personBSteps[j]);
                    return "YES";
                }
            }

        }
        return "NO";
    }

    static boolean check(int p1, int s1, int p2, int s2) {
        int max = Integer.MAX_VALUE;
        while (p1 <= max && p2 <= max) {
            if (p1 == p2)
                return true;
            p1 += s1;
            p2 += s2;
        }
        return false;
    }

    static boolean checkApproach2(int p1, int s1, int p2, int s2) {
        if((p2-p1) % (s2-s1) == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(two_people_meet_each_other(0,3,5,4));
        System.out.println(check(6,3,8,2));
        System.out.println(checkApproach2(0,3,5,4));
    }
}
