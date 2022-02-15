/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author EtecMorato
 */
public class soma {
    public static void main(String[] args) {
        
        //var
        int num1;
        int num2;
        
        //instancia
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\n\t\t\t -- soma Simples -- \n");
        
        //entrada
        System.out.print("digite um numero \n");
        num1 = entrada.nextInt();
        
         System.out.print("digite um numero \n");
        num2 = entrada.nextInt();
        
        //saida
        System.out.println("o resultado é "+(num1+num2));
        
                
    }
    
}
