/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop4;

/**
 *
 * @authoR roo_000
 */
public class POOP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // TODO code application logic here
        Punto punto = new Punto();
        punto.imprimePunto();
        Punto punto2 = new Punto(1,2,"punto 2");
        punto2.imprimePunto();
        
        punto.x=20;
        punto.y=100;
        punto.nombre="punto1";
        punto.imprimePunto();
        System.out.println(punto);
        
        Perro perro = new Perro();
        perro.imprimirPerro();
        Perro perro2 = new Perro("café","chino",15,"snauzer",4);
        perro2.imprimirPerro();
        
        perro2.jugar();
    
        // TODO code application logic here
    }
    
}
