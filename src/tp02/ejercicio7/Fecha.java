/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02.ejercicio7;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author gabriel
 */
public class Fecha {
    public void convertiraFecha (int dia,int mes,int año){
        Locale locale = Locale.getDefault();
        Calendar fecha = Calendar.getInstance();
        fecha.set(año, mes, dia);
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE d MMMM yyyy");
        System.out.println("fecha ingresada : "+sdf.format(fecha.getTime()));
        System.out.println(fecha.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, locale)+", "+fecha.get(Calendar.DAY_OF_WEEK)+" de "+fecha.getDisplayName(Calendar.MONTH, Calendar.LONG, locale)+" de "+fecha.get(Calendar.YEAR));
    }
}
