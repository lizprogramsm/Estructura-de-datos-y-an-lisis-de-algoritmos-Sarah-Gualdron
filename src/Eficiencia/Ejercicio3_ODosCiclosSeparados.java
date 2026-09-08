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
//se trabajan dos ciclos pero no estan uno dentro de otro, entonces no se multiplican se suman

public class Ejercicio3_ODosCiclosSeparados {
    
    public static void main(String[]args){
        Scanner tec=new Scanner(System.in);
        System.out.println("ingrese el valor de n: ");
        int n= tec.nextInt();
        
        int Contador=0;
        
        System.out.println("primer ciclo: ");
        for(int i=0;i<n;i++){
            Contador++;
            System.out.println("i= "+i);
        }
        
        System.out.println("segundo ciclo: ");
        for(int j=0;j<n;j++){
            Contador++;
            System.out.println("j= "+j);
        }
        System.out.println("total de operaciones "+Contador);
        System.out.println("Analisis On(n+n)=O(n)");
        tec.close();
    }
}
// los ciclos for no estan anidados por ello no cuentan como algoritmo 0(n²)
