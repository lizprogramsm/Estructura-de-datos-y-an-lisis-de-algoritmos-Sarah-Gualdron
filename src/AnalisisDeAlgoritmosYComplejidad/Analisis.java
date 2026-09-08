/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnalisisDeAlgoritmosYComplejidad;

/**
 *
 * @author Sarah Gualdron
 */
public class Analisis {
    
    //algoritmo 0(n²)
    public void analisis(){ //metodo
        int n=100;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(i+j);
            }
        }
        
        //analizar algoritmo logaritmico 0(log n)
        int i =1;
        while(i<n){
            i=i*2;
        }
        
        //analizar algoritmo n log n 0(nlogn)
        for(int k=0; k<n; k++){
            int j=1;
            while(j<n){
                j=j*2;
            }
        }
    
    }
    
}
