/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 *
 * @author Professional
 */
public class WelcomeService {
    
    private Calendar cal ;
    
    public final String getSalutation()
    {
       String  sal ;
       cal = new GregorianCalendar(); 
       int h = cal.get(Calendar.HOUR_OF_DAY);
       
       if(h >= 4 && h < 12)
           sal = "Good Morning";
       else if((h >= 12) && (h < 17) )
           sal = "Good Afternoon";
       else if(h >= 17 && h < 21) 
           sal = "Good Evening";
       else
           sal = "Good Night";
       
       return sal;
    }
    
    public final String getMessage(String name){
        return getSalutation() + " " + name + ", Welcome!";
    }

   
}
