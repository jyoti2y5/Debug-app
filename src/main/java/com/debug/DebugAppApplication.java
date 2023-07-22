package com.debug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DebugAppApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(DebugAppApplication.class, args);
		int a,b, temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values:a and b");
		int a1= sc.nextInt();
		int b1= sc.nextInt();
		System.out.println("before swapping value of a and b is:  "+a1+" and "+b1);
		temp=a1;
		a1=b1;
		b1=temp;
		System.out.println("after swapping the value of a and b is: " +a1 +" and "+b1);




	}

}
