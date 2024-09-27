/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author emman_000
 */
public class Perro {
     String color;
    String pelaje;
    int tamaño;
    String raza;
    int edad;
    
    public Perro (){
        color=null;
        pelaje=null;
        tamaño=0;
        raza=null;
        edad=0;
    }
    public Perro(String color, String pelaje, int tamaño, String raza, int edad)
    {
        this.color=color;
        this.pelaje=pelaje;
        this.tamaño=tamaño;
        this.raza=raza;
        this.edad=edad; 
    }
    public void imprimirPerro() {
        System.out.println("Color: " + color);
        System.out.println("Pelaje: " + pelaje);
        System.out.println("Tamaño: " + tamaño);
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad);
    }
    public void jugar(){
        System.out.println("guaf guaf");
    }
    public boolean comer(){
        System.out.println("ñom ñom");
        return true;
    }
    public void correr(){
      System.out.println("guaaaaf");
    }   
    public void morder(){
        System.out.println("grrr");
    }
    public void saltar(float saltar1, float saltar2, float saltar3){
        System.out.println("Me movi a:"+saltar1+","+saltar2+","+saltar3+",");
    }

}
    
