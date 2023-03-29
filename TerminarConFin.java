/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author heladodepistacho
 */
public class TerminarConFin {
    public static void main(String[] args) throws IOException {
        try{
            BufferedWriter fin = new BufferedWriter (new FileWriter("FinConFin.txt",true)); 
            String a= null ;
            Scanner atr = new Scanner (System.in);
            a= atr.next(a);
            while (!a.equals("fin")){
                a= atr.next();
                fin.write(a);
                fin.newLine();
                fin.flush();     
            }
            fin.close();
        }catch (Exception e) {
            
        }
    }
}
