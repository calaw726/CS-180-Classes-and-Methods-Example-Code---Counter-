package com.company;

public class Main {

    public static void main(String[] args) {
	int n = 5;

        System.out.printf("   ");
        for (int i = 1; i <= n; i++)
            System.out.printf("%3d", i);
        System.out.printf("\n");

        for (int i = 1; i <= n; i++) {
            System.out.printf("%3d", i);
            for (int j = 1; j <= n; j++) {
                if (i % j == 0 || j % i == 0)
                    System.out.printf("  *");
                else
                    System.out.printf("   ");
            }
            System.out.println("\n");
        }

    }
}
