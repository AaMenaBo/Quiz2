package main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import main.RectanguloException;
/**
 *
 * @author menab
 */
public class Rectangulo {

    private int ancho;
    private int altura;

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) throws RectanguloException {
        if (ancho<=0) {
            throw new RectanguloException("El ancho no puede ser menor o igual a sero");
        }
        this.ancho = ancho;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura)  throws RectanguloException{
        if (altura<=0) {
            throw new RectanguloException("La altura no puede ser menor o igual a sero");
        }
        this.altura = altura;
    }

    public int getArea() {
        return ancho * altura;
    }

    public int getPerimetro() {
        return ancho * 2 + altura * 2;
    }

}
