/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicados;

import java.util.Scanner;

/**
 *
 * @author lesly
 */
public class PracticaDos {
static Scanner entrada=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    
    public static double potencia (int a, int b){ 
        if(a==0){
            return 1; 
        }else{
            if(b==1){ 
            return a; 
             
        }else{
        return a*potencia(a,b-1);
        }
           
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b; 
        System.out.println("Ingrese el numero ");
        a=entrada.nextInt(); 
         System.out.println("Ingrese la potencia");
        b=entrada.nextInt();
        potencia(a,b);
        System.out.println(potencia(a,b));
    }
    
}
