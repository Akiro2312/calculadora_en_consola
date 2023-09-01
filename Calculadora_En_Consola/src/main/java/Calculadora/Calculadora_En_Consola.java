/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Calculadora;

import java.util.Scanner;


/**
 *
 * @author danda
 */
public class Calculadora_En_Consola {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
            String o;
            int a,b,r;
        System.out.println("Diguite el primer numero :");
         a=leer.nextInt();
         System.out.println("Diguite el segundo numero :");
         b=leer.nextInt(); 
         System.out.println("Digite la operacion + - * / :");
         o=leer.next();
         //Proceso de calculadora 
        switch (o) {
            case "+":
                r=a+b;
            case "-": 
                r=a-b;
            case "*":
                r=a*b;
            case "/":
                r=a/b;
                
                break;
            default:
                throw new AssertionError("colocastes mal la operacion");
        }
        System.out.println("EL RESULTADO DE LA "+ o +" ES IGUAL A :"+r );
    }
}
