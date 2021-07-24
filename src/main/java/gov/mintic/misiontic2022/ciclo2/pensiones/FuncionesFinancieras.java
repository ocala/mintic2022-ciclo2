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
public class FuncionesFinancieras {

   public static void A(){
       System.out.println("Estoy en la funcion FF.A");
       FuncionesFinancieras.B();
   }
   
   public static void B(){
       System.out.println("Estoy en la funcion FF.B");
       FuncionesEdad.D();
   }
   
   public static void C(){
       System.out.println("estoy en la funcion FF.C");
   }
    
}
