/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.diego.semprun;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class DiegoSemprun {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Recursividad r = new Recursividad();
        int counter = 1;
        while (counter == 1) {
            System.out.println("---Opciones---");
            System.out.println("1 - Contar Digitos");
            System.out.println("2 - Suma digitos");
            System.out.println("3 - MCD");
            System.out.println("4 - Invertir");
            System.out.println("5 - Salir");
            System.out.println("------");
            System.out.print("Elija una opcion: ");
            int op = leer.nextInt();
            while (op < 1 || op > 5) {
                System.out.println("Error! Elija un numero dentro de las opciones.");
                op = leer.nextInt();
            }
            switch (op) {
                case 1 -> r.mostrarContar();
                case 2 -> r.mostrarSuma();
                case 3 -> r.mostrarMCD();
                case 4 -> r.mostrarInverso();
                case 5 -> counter++;
                

            }
        }
    }
}
