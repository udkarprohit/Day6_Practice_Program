package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int sum = 0,i = 1;
        while (i <= n/2){
            if(n%i == 0) {
                sum = sum + i;
            }
            i++;
        }

        if(sum == n)
        {
            System.out.println(n + " Perfect Number");
        } else {
            System.out.println(n + " Not An Perfect Number");
        }
    }
}
