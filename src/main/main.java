/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author menab
 */
public class main {

    private static Scanner scan;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int base = 0;
        int altura = 0;
        scan = new Scanner(System.in);

        try {

            System.out.println("Bienvenido, ingrese el ancho del rectangulo");
            base = scan.nextInt();

            System.out.println("Ingrese la altura del rectangulo");
            altura = scan.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Los valores no pueden ser menores o iguales a 0");
        }
        try {
            Rectangulo r = new Rectangulo(base, altura);
            System.out.println(r);
        } catch (RectanguloException e) {
            System.out.println(e.toString());
        }

    }

}
