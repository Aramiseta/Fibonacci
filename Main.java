package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static int fibonacci(int n) {
        return n != 0 && n != 1 ? fibonacci(n - 2) + fibonacci(n - 1) : n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell us which fibonacci number you want to know: ");
        int n = scanner.nextInt();
        System.out.println(n + " number of Fibonacci string is: " + fibonacci(n));
    }
}
