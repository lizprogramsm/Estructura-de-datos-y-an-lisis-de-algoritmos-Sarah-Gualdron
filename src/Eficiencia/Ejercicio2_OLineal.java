/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eficiencia;

import java.util.Scanner;

/**
 *
 * @author Sarah Gualdron
 */
//el numero de operaciones crece proporcionalmente con n 
public class Ejercicio2_OLineal {
    
    public static void main (String[]args){
        Scanner tec=new Scanner(System.in);
        
        System.out.println("Ingrese el valor de n: ");
        int n=tec.nextInt();
        
         int Contador=0;
         for(int i =0; i<n;i++){
             Contador++;
             System.out.println("interacion "+i);
             
         }
         System.out.println("total de operaciones del ciclo: "+Contador);
         System.out.println("complejidad O(n)");
         
         tec.close();
    }
    //si n=5 el ciclo se repite 5 veces, el crecimiento es lineal.
}
