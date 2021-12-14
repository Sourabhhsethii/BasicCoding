package com.oca.training.udemy.javabasic;
import static java.lang.System.out;

/**
 *
 */
public class WholeNumericPrimitives {
    public static void main(String[] args) {
        long max = 32121_12112_121_32L;
        long n = 2_30_0;
        out.println(n);
        int oct = 010; //8 decimal
        int secondOct = 022; //18 decimal

        int sumOct = oct + secondOct;
        out.println("first= " + oct + "second= " +  secondOct);
        out.println("decimal sum= "+ sumOct + " octSum =" + Integer.toOctalString(sumOct));

        // hexadecimal (0-9 and A-F)
        out.println("--------------");
        int firstHex = 0xF;
        int secondHex = 0x1E;
        int sumHex = firstHex + secondHex;
        out.println("first= " + firstHex + " second= 0" +  secondHex);
        out.println("decimalSum= " + sumHex + " hexSum= " + Integer.toHexString(sumHex));

        // Binary (0/1)
        out.println("--------------");
        int firstBin = 0b1001; // 9 decimal
        int secondBin = 0b0111; // 7 decimal

        int sumBin = firstBin + secondBin; // 16 decimal

        out.println("first = " + firstBin + "second = " + secondBin);
        out.println("sum = " + sumBin + " binary "+  Integer.toBinaryString(sumBin));

    }
}
