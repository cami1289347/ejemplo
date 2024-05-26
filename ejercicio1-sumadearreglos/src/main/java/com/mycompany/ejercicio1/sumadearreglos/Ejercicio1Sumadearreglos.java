
package com.mycompany.ejercicio1.sumadearreglos;


public class Ejercicio1Sumadearreglos {

    public static void main(String[] args) {
        int[]arreglo={7,4,2,1};
        int suma=sumaArreglo(arreglo);
        System.out.println("La suma de los elementos de un arreglo es: "+suma);
    }
    public static int sumaArreglo(int[]arreglo) {
        int suma=0;
        for (int i=0; i<arreglo.length;i++){
            suma+=arreglo[i];
        }
     return suma;
    }
}