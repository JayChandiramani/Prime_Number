package com.jetbrain;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner Input=new Scanner(System.in);
	int num1;

	//The Number Input
        System.out.println("Please enter a number.");
	    System.out.print("Number:");
        num1=Input.nextInt();
        System.out.println();

	//Checking if the number is prime
        if (num1 % 2 == 0 && num1 !=2)
            System.out.println(num1+" is not a prime number.");
        else
            {
                if (num1 % 3 == 0 && num1 !=3)
                    System.out.println(num1+" is not a prime number.");
                else
                    {
                        if (num1 % 5 ==0 && num1 !=5)
                            System.out.println(num1+" is not a prime number.");
                        else
                            System.out.println(num1+" is a prime number.");
                    }
            }
    }
}
