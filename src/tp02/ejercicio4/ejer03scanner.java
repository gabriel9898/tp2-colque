/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author gabriel-not
 */
public class ejer03scanner {
    public static void main(String[] args) {
        String variablestring;
        String caracter;
        Scanner vocales=new Scanner(System.in);
        Buscarcadena3 cadena = new Buscarcadena3();
        
        System.out.println("ingrese un texto: ");
        variablestring = vocales.nextLine();
        
        System.out.println("ingrese un caracter: ");
        caracter = vocales.next();
        cadena.buscar(variablestring, caracter);
        
    }
}
