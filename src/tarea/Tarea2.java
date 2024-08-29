/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea;

import java.util.Scanner;
public class Tarea2 {
    
        public static void main(String[] args) {
            String dni,mensaje;
            Scanner lectura = new Scanner(System.in);
            System.out.print("Ingrese Numero de DNI : ");
            dni = lectura.next();
            if(dni.length()==8)
            {
                mensaje = "El DNI : "+ dni + " es valido";
            }
            else
            {
                 mensaje = "El DNI : "+ dni + " NO es valido";
            }
            System.out.println(mensaje);
        }
}
