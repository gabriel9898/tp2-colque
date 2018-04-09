/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02.ejercicio4;

import tp02.ejercicio1.*;

/**
 *
 * @author gabriel-not
 */
public class Vocales1 {
    public void CantDeVocales(String cad){
     int cont = 0;
     for (int i=1;i<cad.length()+1;i++){
         char v = cad.charAt(i-1);
         if ((v=='a') || (v =='e') || (v=='i') || (v =='o') || (v=='u') || (v=='A') || (v =='E') || (v=='I') || (v =='O') || (v=='U')){
             cont ++;
         }
     }
        System.out.println("cantidad de vocales: "+cont);
}
}
