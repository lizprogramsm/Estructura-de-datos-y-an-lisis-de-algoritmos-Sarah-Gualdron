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
//O notación Big O (O grande)un método matemático que mide cómo crece el tiempo de ejecución o el uso de memoria de un programa a medida que aumenta el tamaño de los datos de entrada
//en vez de avanzar de 1 en 1 el programa se reduce a la mitad 

public class Ejercicio6_OLogaritmica {
    
    public static void main(String[]args){
        Scanner tec=new Scanner (System.in);
        
        System.out.println("Ingrese el valor de n: ");
        int n=tec.nextInt();
        
        int Contador=0;
        
        for(int i= n; i>1; i=i/2){
            Contador++;
            System.out.println("valor actual de i: "+i);
            
        }
        System.out.println("total de iteraciones: "+Contador);
        System.out.println("complejidad O(log n)");
        tec.close();
    }
    //si n =16 se divide a si mismo hasta llegar a una minima expresion de iteraciones 
}
