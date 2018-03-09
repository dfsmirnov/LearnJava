package Bitwise_and_bitshift_operations;

//Given a natural number N, not less than 10.
//
//        Output the result of XOR'ing two last digits of this number.
//
//        Sample Input 1:
//
//        11
//        Sample Output 1:
//
//        0
//        Sample Input 2:
//
//        12
//        Sample Output 2:
//
//        3
//        Sample Input 3:
//
//        1115
//        Sample Output 3:
//
//        4


import java.util.Scanner;

public class XOR_two_last_digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // it reads an integer value from the standard input
        int a, b;
        a = N % 10;
        b = N / 10 % 10;
        System.out.println(a ^ b);
    }
}
