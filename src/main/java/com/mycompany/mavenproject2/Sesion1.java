/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Oscar
 */
public class Sesion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Define Definir
        //Set Asignar la variable
        // Expresion, Literal, Tipo de dato
        // nombre, valor
        
        double x = 1.0;
        double y = -2.5;
        int n = (int) x;
        int m = (int) y;
        int p = (int) 3.14159265;
        int k = 10;
        int i = k + 1;
        int j = 2 * k;
                
        j = k * (int) x;  
        i = i * k * j;
        System.out.println("linea 29 i=" + i );
        
        j = j * k - i;
        System.out.println("i=" + i + "j=" + j + "k=" + k);
        
    }
    
}
