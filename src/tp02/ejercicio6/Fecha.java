/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02.ejercicio6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author gabriel
 */
public class Fecha {
   
     public void diferenciaEntreDosFechas(String f1,String f2) throws ParseException{
        Calendar fecha1 = Calendar.getInstance();
        Calendar fecha2 = Calendar.getInstance();
    
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
        fecha1.setTime(sdf.parse(f1));
        fecha2.setTime(sdf.parse(f2));
        
        System.out.println("Introduzca la fecha con formato dd/mm/yy");
        if (fecha1.compareTo(fecha2) == 0){
            System.out.println("Las dos fechas son iguales,vuelva a ingresar una fecha");
        }else{
            if (fecha1.compareTo(fecha2) >= 1){    
                long milisec = fecha1.getTimeInMillis()-fecha2.getTimeInMillis();
                long dias = (milisec /1000/60/60/24);
                System.out.println("Cantidad de dias entre "+fecha2.get(Calendar.DAY_OF_MONTH)+"/"+(fecha2.get(Calendar.MONTH)+1)+"/"+fecha2.get(Calendar.YEAR)+" y "+fecha1.get(Calendar.DAY_OF_MONTH)+"/"+(fecha1.get(Calendar.MONTH)+1)+"/"+fecha1.get(Calendar.YEAR)+ " son:"+dias);        
                
            }else{
                long milisec = fecha2.getTimeInMillis()-fecha1.getTimeInMillis();
                long dias = (milisec /1000/60/60/24);
                System.out.println("Cantidad de dias entre "+fecha1.get(Calendar.DAY_OF_MONTH)+"/"+(fecha1.get(Calendar.MONTH)+1)+"/"+fecha1.get(Calendar.YEAR)+" y "+fecha2.get(Calendar.DAY_OF_MONTH)+"/"+(fecha2.get(Calendar.MONTH)+1)+"/"+fecha2.get(Calendar.YEAR)+ " son:"+dias);        
                
            }
        }  
    }
}
