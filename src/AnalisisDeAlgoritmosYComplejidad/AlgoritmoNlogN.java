/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnalisisDeAlgoritmosYComplejidad;

/**
 *
 * @author Sarah Gualdron
 */
public class AlgoritmoNlogN {
    
    public static void main(String[]args){
        int n=10;
        int Contador=0;
        //algoritmo 0(nlogn)
        for(int i=0;i<n;i++){
            int j=1;
            while(j<n){
                j=j*2;
                Contador++;
            }
        }
        System.out.println("total de ejecuciones: "+Contador);
    }
}
