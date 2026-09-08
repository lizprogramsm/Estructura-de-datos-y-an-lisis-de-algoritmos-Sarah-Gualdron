/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnalisisDeAlgoritmosYComplejidad;

/**
 *
 * @author Sarah Gualdron
 */
public class AnalisisAlgortimo {
    
    public static void main(String[]agrs){
        int n=10;
        int Contador=0;
        //algoritmo 0(n)
        for(int i=0;i<n;i++){
            System.out.println("interacion: "+i);
            Contador++;
        }
        System.out.println("total de ejecuciones: "+Contador);
    }
    
}
