/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colaborar;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Hemihundias
 */
public class Colaborar {
    
    /**
     * @param args the command line arguments
     */                
    public static void main(String[] args) {
        // TODO code application logic here
        File fichero = new File(args[1]);       
        String num;
        num = args[0];
        if(!isNumeric(num)){
            System.out.println("Valor incorrecto.");
            return;
        }   
        int r = Integer.parseInt(num);
        int t = 10;
        for(int i=0;i<r;i++){
            try {
                Runtime.getRuntime().exec("java -jar lenguaje.jar" + " " + t + " " + fichero);
                t += 10;                
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }        
    }
    
    public static boolean isNumeric(String num) {
        boolean resultado;
        try {
            Integer.parseInt(num);
            resultado = true;
        } catch (NumberFormatException e) {
            resultado = false;
        }
        return resultado;
    }       
    
}
