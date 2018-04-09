/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02.ejercicio5fecha;

import java.text.ParseException;
import java.util.Calendar;
/**
 *
 * @author gabriel
 */
public class ejer05 {
    public static void main(String[] args) throws ParseException {
        Calendar fecha1 = Calendar.getInstance();
        Calendar fecha2 = Calendar.getInstance();
        fecha2.set(1995, 2,22);
        fecha1.set(1995, 3,27);
        Fecha fecha = new Fecha();
        
        //fecha.devolverEdadenSemanas(fecha1);
        //fecha.ObterEstacion(fecha1);
        //fecha.mostraFechas(fecha1,fecha2);    
        fecha.mostrarcantDomingos(fecha1,fecha2);   
    }
}
