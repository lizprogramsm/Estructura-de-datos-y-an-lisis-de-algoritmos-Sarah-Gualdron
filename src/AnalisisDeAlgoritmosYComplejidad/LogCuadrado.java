/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnalisisDeAlgoritmosYComplejidad;

/**
 *
 * @author Sarah Gualdron
 */
public class LogCuadrado {
    
    public static void main(String[]args){
        int n=1024;
        int Contador=0;
        int i=1;
        
        //algoritmo 0(log n)²)
        while (i<n){
            int j=1;
            
            while(j<n){
                Contador++;
                j=j*2;
            }
            i=i*2;
        }
        System.out.println("total de ejecuciones: "+Contador);
    }
}
