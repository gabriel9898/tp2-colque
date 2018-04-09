/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02.ejercicio3;

/**
 *
 * @author gabriel-not
 */
public class Buscarcadena {
    public void buscar(String cad,char car){
     int cont = 0;
     for (int i=1;i<cad.length()+1;i++){
         char v = cad.charAt(i-1);
         if (v == car) {
             cont++;
         }
     }
        System.out.println("cantidad de caracteres iguales a '"+car+"' son igual a "+cont);  
    }
}
