package edu.carrollcc.cis232;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner kb=new Scanner(System.in);
    	System.out.print("Enter name: ");
    	String name=kb.next();
        System.out.printf("Hello %s!%n",name);
        kb.close();
    }
}
