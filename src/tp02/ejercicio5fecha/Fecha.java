/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02.ejercicio5fecha;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author gabriel
 */
public class Fecha {
    public void devolverEdadenSemanas(Calendar fnac) {
        Calendar factual = Calendar.getInstance();
    
        long milisec = factual.getTimeInMillis()-fnac.getTimeInMillis();
        long dias = (milisec /1000/60/60/24)/7;
        System.out.println("Cantidad de semanas : "+ dias);
    }

    public void ObterEstacion (Calendar festacion) {
        
       // SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String m = null;
        int mes = 10;
        
        System.out.println("mes: " +festacion.get(Calendar.MONTH));
        mes = festacion.get(Calendar.MONTH);
        if((mes>=0&&mes<2) || (festacion.get(Calendar.MONTH)== 11 && festacion.get(Calendar.DAY_OF_MONTH)>20)|| (festacion.get(Calendar.MONTH)== 2 && festacion.get(Calendar.DAY_OF_MONTH)<21)){
            m="Verano";
        }else{
            if((mes>=2&&mes<5)|| (festacion.get(Calendar.MONTH)== 2 && festacion.get(Calendar.DAY_OF_MONTH)>20)|| (festacion.get(Calendar.MONTH)== 5 && festacion.get(Calendar.DAY_OF_MONTH)<21)){
                m="Otoño";
            }else{
                if((mes>=5&&mes<8)|| (festacion.get(Calendar.MONTH)== 5 && festacion.get(Calendar.DAY_OF_MONTH)>20)|| (festacion.get(Calendar.MONTH)== 8 && festacion.get(Calendar.DAY_OF_MONTH)<21)){
                    m="Invierno";
                }else{
                    if((mes>=8&&mes<11) || (festacion.get(Calendar.MONTH)== 8 && festacion.get(Calendar.DAY_OF_MONTH)>20)|| (festacion.get(Calendar.MONTH)== 11 && festacion.get(Calendar.DAY_OF_MONTH)<21)){
                        m="Primavera";
                    }
                }
            }
        }
        System.out.println("la estacion es: "+m);
    }

    public void mostraFechas (Calendar fecha1,Calendar fecha2) {
        
        if (fecha1.compareTo(fecha2) == 0){
            System.out.println("Las dos fechas son iguales,vuelva a ingresar una fecha");
        }else{
            if (fecha1.compareTo(fecha2) >= 1){    
                System.out.println("Fecha1 es mayor que fecha2,vuelva a ingresar una fecha");
            }else{
                 System.out.println("las fechas entre "+fecha1.get(Calendar.DAY_OF_MONTH)+"/"+(fecha1.get(Calendar.MONTH)+1)+"/"+fecha1.get(Calendar.YEAR)+" y "+fecha2.get(Calendar.DAY_OF_MONTH)+"/"+(fecha2.get(Calendar.MONTH)+1)+"/"+fecha2.get(Calendar.YEAR)+ " son:");
                 long milisec = fecha2.getTimeInMillis()-fecha1.getTimeInMillis();
                 long dias = (milisec /1000/60/60/24);
                 for (int i=0;i<dias-1;++i){
                    fecha1.add(Calendar.DAY_OF_MONTH, 1);
                    System.out.println(fecha1.get(Calendar.DAY_OF_MONTH)+"/"+(fecha1.get(Calendar.MONTH)+1)+"/"+fecha1.get(Calendar.YEAR));
                 }
                 
            }
        }        
        
    }

    public void mostrarcantDomingos (Calendar fecha1,Calendar fecha2) {
        Locale locale = Locale.getDefault();
        int cont = 0;
        
        if (fecha1.compareTo(fecha2) == 0){
            System.out.println("Las dos fechas son iguales,vuelva a ingresar una fecha");
        }else{
            if (fecha1.compareTo(fecha2) >= 1){    
                long milisec = fecha1.getTimeInMillis()-fecha2.getTimeInMillis();
                long dias = (milisec /1000/60/60/24);
                System.out.print("Cantidad de domingos entre "+fecha2.get(Calendar.DAY_OF_MONTH)+"/"+(fecha2.get(Calendar.MONTH)+1)+"/"+fecha2.get(Calendar.YEAR)+" y "+fecha1.get(Calendar.DAY_OF_MONTH)+"/"+(fecha1.get(Calendar.MONTH)+1)+"/"+fecha1.get(Calendar.YEAR)+ " son:");        
                for (int i=0;i<dias;++i){
                    fecha2.add(Calendar.DAY_OF_MONTH, 1);
                    if (fecha2.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, locale) == "domingo"){
                       ++cont;
                    }    
                }
                System.out.println(cont);
            }else{
                long milisec = fecha2.getTimeInMillis()-fecha1.getTimeInMillis();
                long dias = (milisec /1000/60/60/24);
                System.out.print("Cantidad de domingos entre "+fecha1.get(Calendar.DAY_OF_MONTH)+"/"+(fecha1.get(Calendar.MONTH)+1)+"/"+fecha1.get(Calendar.YEAR)+" y "+fecha2.get(Calendar.DAY_OF_MONTH)+"/"+(fecha2.get(Calendar.MONTH)+1)+"/"+fecha2.get(Calendar.YEAR)+ " son:");        
                for (int i=0;i<dias;++i){
                    fecha1.add(Calendar.DAY_OF_MONTH, 1);
                    if (fecha1.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, locale) == "domingo"){
                       ++cont;
                    }    
                }
                System.out.println(cont);
            }
        }        
    
    }
}
