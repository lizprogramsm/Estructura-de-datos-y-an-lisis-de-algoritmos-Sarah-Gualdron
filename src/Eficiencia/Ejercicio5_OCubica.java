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
// tres ciclos anidados 
public class Ejercicio5_OCubica {
    
    public static void main(String[]args){
        Scanner tec=new Scanner(System.in);
        
        System.out.println("Ingrese el valor de n ");
        int n=tec.nextInt();
        
        int Contador=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0; k<n;k++){
                    Contador++;
                    System.out.println("i= "+i+", j= "+j+", k= "+k);
                }
            }
        }
        System.out.println("total de operaciones "+ Contador);
        System.out.println("complejidad O(n^3)");
        tec.close();
    }
}