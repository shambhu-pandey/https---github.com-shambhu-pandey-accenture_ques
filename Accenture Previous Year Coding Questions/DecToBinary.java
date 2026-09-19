/*
Problem Statement 

Convert decimal no to binary

Input: 10
Output: 1010

*/


import java.util.*;


public class BinaryConversion {

    // Decimal to Binary
    public static String decToBinary(int n) {

        if (n == 0) {
            return "0";
        }

        String ans = "";

        while (n > 0) {

            int lastBit = n & 1;

            ans = lastBit + ans;

            n = n >> 1;
        }

        return ans;
    }

    // Binary to Decimal
    public static int binaryToDecimal(int n) {

        int ans = 0;
        int base = 1;

        while (n > 0) {

            int lastBit = n % 10;

            ans += lastBit * base;

            base *= 2;

            n = n / 10;
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Decimal to Binary
        System.out.print("Enter decimal number: ");
        int decimal = sc.nextInt();

        System.out.println(
            "Binary: " + decToBinary(decimal)
        );

        // Binary to Decimal
        System.out.print("Enter binary number: ");
        int binary = sc.nextInt();

        System.out.println(
            "Decimal: " + binaryToDecimal(binary)
        );

        sc.close();
    }
}





