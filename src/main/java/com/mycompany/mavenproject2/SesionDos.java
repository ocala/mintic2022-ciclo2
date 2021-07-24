package com.mycompany.mavenproject2;

import java.util.Scanner;

public class SesionDos{
	
	public static void main(String[] args){
            Scanner sc = new Scanner (System.in);
            System.out.println("Ingrese numero:");
            int n = sc.nextInt();
            int m = n * 2;
            System.out.println("Resultado: "+m);
	}	
}