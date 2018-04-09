/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02.ejercicio2;

/**
 *
 * @author gabriel-not
 */
public class Invertirfrase {
    public void invertir (String cad){
     String cadenainvertida = "";
     for (int i=1;i<=cad.length();i++){
         cadenainvertida = cadenainvertida + cad.charAt(cad.length()-i);
     }
        System.out.println("cadena invertida: "+cadenainvertida);
    }
}
