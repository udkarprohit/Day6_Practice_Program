package com.bridgelabz;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value : ");
        int n = sc.nextInt();
        int num1 = 0, num2 = 1;
        for (int i = 1; i<=n;i++)
        {
            System.out.print(num1 + " , ");
            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }
    }
}
