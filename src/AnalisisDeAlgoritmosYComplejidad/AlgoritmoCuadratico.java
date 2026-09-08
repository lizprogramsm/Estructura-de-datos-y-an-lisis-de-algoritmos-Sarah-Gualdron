/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnalisisDeAlgoritmosYComplejidad;

/**
 *
 * @author Sarah Gualdron
 */
public class AlgoritmoCuadratico {
    
    public static void main(String[]args){
        
        int n=5; //tamaño de cada ciclo
        int Contador=0;
        
        //Algoritmo 0(n²)
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(i+ " " +j);//por cada valor de i j tambien recorre de 0 a 4 (5 veces)
                Contador++;
            }
        }
        System.out.println("total de ejecucuiones: "+Contador);
    }
    
}
