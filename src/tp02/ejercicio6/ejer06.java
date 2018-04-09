/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02.ejercicio6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class ejer06 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        Fecha fecha = new Fecha();
        Calendar cal = Calendar.getInstance();
                
        System.out.println("Introduzca las fechas con el formato dd/mm/yyyy");
        System.out.println("Ingrese fecha 1");
        String fecha1 = scanner.nextLine();
        System.out.println("Ingrese fecha 2");
        String fecha2 = scanner.nextLine();
        
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        Date testDate1 = null;
        Date testDate2 = null;

        try{
            testDate1 = df.parse(fecha1);
            testDate2 = df.parse(fecha2);
        } catch (Exception e){ System.out.println("invalid format");}
        
        if ((!df.format(testDate1).equals(fecha1)) || (!df.format(testDate2).equals(fecha2))){
            System.out.println("fecha invalida!!");
        } else {
            System.out.println("fecha valida");
            fecha.diferenciaEntreDosFechas(fecha1,fecha2);
        }
        
        
    }
}
