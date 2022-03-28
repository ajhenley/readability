package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner x = new Scanner(System.in);

        // String
        String name = x.nextLine();

        // int
        int age = x.nextInt();

        //double
        double gpa = x.nextDouble();

        for (int i = 0; i < 5; i++)
        {
            name = x.nextLine();
        }
    }
}
