/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diego.semprun;

/**
 *
 * @author diego
 */
import java.util.Scanner;

public class Recursividad {

    Scanner leer = new Scanner(System.in);

    public int Numero() {

        System.out.println("Ingrese un numero");
        while (!leer.hasNextInt()) {
            System.out.println("Ingrese un numero valido.");
            leer.next();
        }
        int numero = leer.nextInt();
        return numero;

    }

    public int Contar(int Numero) {
        int contador;
        if (Numero < 10) {
            return 1;
        } else {
            Numero = Numero / 10;
            contador = 1 + Contar(Numero);
            return contador;
        }

    }

    public void mostrarContar() {
        int numero = Numero();
        System.out.println("La cantidad de digitos que hay es de: " + Contar(numero));
    }

    public int Sumar(int Numero) {
        int contador;
        if (Numero == 0) {
            return 0;
        } else {
            int resto = Numero % 10;
            Numero = Numero / 10;
            contador = resto + Sumar(Numero);
            return contador;
        }

    }

    public void mostrarSuma() {
        int numero = Numero();
        System.out.println("La suma entre los numeros " + numero + " es de: " + Sumar(numero));
    }

    public int MCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            MCD(a, a % b);
        }
        return a;
    }

    public void mostrarMCD() {
        int num1 = Numero();
        int num2 = Numero();
        System.out.println("La MCD de los numeros es: " + MCD(num1, num2));
    }

    public String Invertir(String cadena) {
        if (cadena.isEmpty()) {
            return cadena;
        }
        return Invertir(cadena.substring(1)) + cadena.charAt(0);

    }

    public void mostrarInverso() {
        System.out.print("Ingrese una cadena: ");
        String cadena = leer.next();
        System.out.println("Cadena invertida: " + Invertir(cadena));

    }
}
