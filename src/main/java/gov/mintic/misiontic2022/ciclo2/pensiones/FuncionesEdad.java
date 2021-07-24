/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.mintic.misiontic2022.ciclo2.pensiones;

/**
 *
 * @author Oscar
 */
public class FuncionesEdad {

    public static void D() {
        int p = 10, q = 23;
        float o = 3.14f;
        System.out.println("Estoy en  FEdad.D");
        // cast - casting
        o = F(p, o, "Oscar");
        E(34);
    }

    public static void E(int edad) {
        if (edad > 0 && edad <= 10) {
            System.out.println("Rango de edad 1");
        } else if (edad > 10 && edad <= 19) {
            System.out.println("Rango de edad 2");
        } else if (edad > 20 && edad <= 29) {
            System.out.println("Rango de edad 3");
            if (edad > 20 && edad <= 22) {
                System.out.println("Rango de edad 3.1");
            } else if (edad > 23 && edad <= 27) {
                System.out.println("Rango de edad 3.2");
            } else if (edad > 28){                
                System.out.println("Rango de edad 3.3");
            }
        } else if (edad > 30 && edad <= 49) {
            System.out.println("Rango de edad 4");
        } else {
            System.out.println("Rango de edad 5");
        }
    }

    // <public, private, protected, > <static/final/abstract> <int, boolean, short, float, double, String, Object> <nmbre funcion>(<Li_para>){
    // }
    // se definen,
    // se inicializa.. 
    // se asignan,
    // se asigna el resultado de una expresion, 
    // se le asigna un literal, 
    // tiene un nombre, 
    // tiene un tipo de datos
    //
    //
    //
    public static float F(int x, float y, String nombre) {
        float z = y + x + 2;
        float q = 0.0f;
        if (z > 0) {
            z = 2 * (z + 1);
            q = z * 2;
        } else {
            z = (z + 3);
            q = z * 2;
        }
        return z + q;
    }
}
