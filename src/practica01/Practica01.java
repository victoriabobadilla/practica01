/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica01;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Practica01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner lector=new Scanner(System.in);
        int a,b,c=0;
        System.out.println("la tabla de multiplicacion");
       
        System.out.println("ingrese un mumero:");
        a=lector.nextInt();
        System.out.println("ingrese el segundo numero:");
        b=lector.nextInt();
        
        for (int i = 0; i != b; i++){
            
            c=c+a;
            System.out.println("la multiplicaion del numero:"+a+" es "+c);
            
            
       
        }
        
        

        
    }
    
}
