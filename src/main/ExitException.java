/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author menab
 */
public class ExitException extends Exception{
    public ExitException(){
        super("El valor para salir debe ser SI o NO");
    }
}
