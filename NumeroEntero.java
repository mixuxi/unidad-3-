/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
    /**
     * 
     * @author asus 
     */
public class NumeroEntero {
    
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);
        
        System.out.print("ingresa un numero entero: ");
        int numero = lectura.nextInt();
        
        if(numero % 2 == 0){
            System.out.println("el numero" + numero + "es par.");
        }else {
            System.out.println("el numero" + numero + "es impar.");  
        }
        
        
        lectura.close();    
    }
    
}
