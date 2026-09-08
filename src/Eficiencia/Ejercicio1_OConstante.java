/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eficiencia;

/**
 *
 * @author Sarah Gualdron
 */

//no importa el valor de n simepre se ejecucta la misma cantidad de instrucciones 

public class Ejercicio1_OConstante {
    public static void main(String[]args){
        int n=100;
        int Contador=0;
        System.out.println("inicio del algoritmo");
        Contador++; // aperacion 1
        
        int x=5;
        Contador++; //operacion 2
        int y=10;
        Contador++; //operacion 3 
        
        int suma=x+y;
        
        Contador++;//operacion 4 
        System.out.println("la suma es: "+suma);
        System.out.println("el valor de n: "+n);
        System.out.println("operaciones encontradas "+Contador);
        System.out.println("complejidad O(1)");
    }  
}
