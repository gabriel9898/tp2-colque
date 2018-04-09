/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02.ejercicio4;

import tp02.ejercicio3.*;

/**
 *
 * @author gabriel-not
 */
public class Buscarcadena3 {
    public void buscar(String cad,String car){
     int cont = 0;
     if (cad.length() != 1){
     if (car.length() == 1){
        for (int i=1;i<cad.length()+1;i++){
             char v = cad.charAt(i-1);
             if (v == car.charAt(0)) {
                 cont++;
            }
        }
        System.out.println("cantidad de caracteres iguales a '"+car+"' son igual a "+cont);  
    }else{
            System.out.println("ingrese solo un caracter");
    }
     }else{
         System.out.println("no ingreso una cadena de caracteres");
     }
}
}
