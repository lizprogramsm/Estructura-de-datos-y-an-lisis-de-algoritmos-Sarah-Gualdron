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
//un ciclo externo corre n veces, y dentro de otro que divide entre 2
public class Ejercicio7_ONlogN {
    
    public static void main(String []args){
        Scanner tec=new Scanner(System.in);
        System.out.println("Ingrese el valor de n: ");
        int n=tec.nextInt();
        
        int Contador=0;
        
        for(int i=0;i<n;i++){
            for(int j=n; j>1;j=j/2){
                Contador++;
                System.out.println("i= "+i+", j= "+j);
            }
        }
        System.out.println("Total de iteraciones "+Contador);
        System.out.println("complejidad O(n log n)");
        tec.close();
    }
}//se combina el crecimiento lineal con el crecimiento logaritmico 
