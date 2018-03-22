package Floating_point_types;

//Write a program that reads a temperature in Celsius (°C) and shows its equivalent in Fahrenheit temperature (°F).
//
//        Use the following formula:
//
//        F = C * 1.8 + 32
//        Where C is a temperature in Celsius, F - is a temperature in Fahrenheit.
//
//        Sample Input 1:
//
//        32.9
//        Sample Output 1:
//
//        91.22
//        Sample Input 2:
//
//        0
//        Sample Output 2:
//
//        32.0

import java.util.Scanner;

public class Celsius_to_Fahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float F = scanner.nextFloat(); // it reads an integer value from the standard input
        System.out.println(F * 1.8f + 32.f);
    }
}
