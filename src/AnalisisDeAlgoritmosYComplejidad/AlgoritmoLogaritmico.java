/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnalisisDeAlgoritmosYComplejidad;

/**
 *
 * @author Sarah Gualdron
 */
public class AlgoritmoLogaritmico {
    
    public static void main(String[]args){
        int n=100;
        int Contador=0;
        int i=1;
        
        //log 
        while(i<n){
            System.out.println("valor: "+ i);
            i=i*2; //i se duplica
            Contador++;
        }
        System.out.println("total de ejecucuiones: "+ Contador);
    }
}
