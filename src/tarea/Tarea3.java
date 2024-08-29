/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea;

import java.util.Scanner;
public class Tarea3 {
     public static void main(String[] args) {
            int  nota;
            String   mensaje;
            Scanner lectura = new Scanner(System.in);
            System.out.print("Ingrese Nota : ");
            nota = lectura.nextInt();
            if(nota>=0 && nota<=10)
            {
                mensaje ="La Nota en letra es : " + "C";
            }
            else if (nota>=11&& nota<=12)
            {  mensaje ="La Nota en letra es : " + "B";
            }
            else if (nota>=13 && nota<=17)
            {  mensaje ="La Nota en letra es : " + "A";
            }
            else if (nota>=17 && nota <=20)
            {
              mensaje ="La Nota en letra es : " + "AD";
            }
            else
            {
              mensaje ="Nota invalida";
            }    
            System.out.println(mensaje);
        }
}
