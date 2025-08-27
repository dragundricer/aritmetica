
package com.mycompany.aritmetica;

import java.util.Scanner;

public class Aritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingresar números
        System.out.print("Ingrese el primer número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = sc.nextDouble();

        // Calcular suma
        double suma = numero1 + numero2;

        // Calcular promedio
        double promedio = suma / 2;
        System.out.println("Resultado");
        // Mostrar resultados
        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);

        sc.close();
    }
}