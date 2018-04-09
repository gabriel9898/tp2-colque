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
public class ejer01scanner {
    public static void main(String[] args) {
        String variablestring;
        Scanner vocales=new Scanner(System.in);
        Vocales1 vocal = new Vocales1();
        
       
        System.out.println("ingrese un texto: ");
        variablestring = vocales.nextLine();
        vocal.CantDeVocales(variablestring);
        
        
    }
}
