/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02.ejercicio7;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class ejer07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduzca laa fechas con el formato dd/mm/yyyy");
        System.out.println("Ingrese dia: ");
        int dia = scanner.nextInt();
        if (dia>0 && dia<=31){
            System.out.println("Ingrese mes: ");
            int mes = scanner.nextInt();
            if (mes>0 && mes <=12){
                System.out.println("Ingrese año: ");
                int año = scanner.nextInt();
                if (año>0){
                    Fecha fecha = new Fecha();
                    fecha.convertiraFecha(dia, mes, año);
                }else{
                    System.out.println("año invalida, el año debe estar entre 1 y 99");
                }
            }else{
                System.out.println("mes invalido, el mes debe estar entre 1 y 12");
            }
        }else{
            System.out.println("dia invalido, el dia debe estar entre 1 y 31");
        }
    }
}
