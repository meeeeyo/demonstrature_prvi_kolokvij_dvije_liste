
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mmarkovic;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Meeeyo
 */
public class Pomocno {
    
    public static Scanner ulaz;
    
     public static String ucitajString(String poruka) {
        String s=new String();
        while(true){
            System.out.println(poruka);
            s = Pomocno.ulaz.nextLine();
            if(!s.trim().isBlank()){
                return s;
            }
            System.out.println("Obavezan unos");
        }
    }
     
     public static String ucitajNazivBolesti(String poruka) {
        String s=new String();
        while(true){
            System.out.println(poruka);
            s = Pomocno.ulaz.nextLine();
            if(!s.trim().isBlank()){
                return s;
            }
            System.out.println("Naziv bolesti obavezno");
        }
    }
    
   public static int ucitajInt(String poruka){
       int i=0;
       while(true){
           System.out.println(poruka);
           try {
               i=Integer.parseInt(Pomocno.ulaz.nextLine());
               if(i<0){
                   System.out.println("Broj mora biti pozitivan");
               }else{
                   break;
               }
           } catch (Exception e) {
               System.out.println("greška");
           }
           
       }
       return i;
       
   } 
   
    
   public static Date ucitajDatum(String poruka){
       SimpleDateFormat sdf = 
                new SimpleDateFormat(
                        "dd.MM.yyyy.",
                        new Locale("hr","HR")
                );
       for(;;){
           try {
               System.out.println(poruka);
               return sdf.parse(Pomocno.ulaz.nextLine());
           } catch (Exception e) {
               System.out.println("Unosa datuma obavezno u formatu dd.MM.yyyy.");
           }
       }
   }
  
    
}

