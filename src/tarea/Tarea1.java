/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea;

import java.util.Scanner;
public class Tarea1 {
       
    public static void main(String[] args) {
        
        int num1,num2,num3,menor;
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese primer numero : ");
        num1 = lectura.nextInt();
        System.out.print("Ingrese segundo numero : ");
        num2 = lectura.nextInt();
        System.out.print("Ingrese tercer numero : ");
        num3 = lectura.nextInt();
        menor = num1;
        if(menor>num2)
        {
            menor=num2;
        }
        if(menor>num3)
        {
            menor=num3;
        }
        System.out.println("El numero menor es :"+ menor);
        
    }
    
}
