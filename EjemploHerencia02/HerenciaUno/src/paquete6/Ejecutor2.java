/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Ejecutor2 {

    public static void main(String[] args) {

        //Ingresar estudiantes de tipo presencial por teclado
        // el usuario decide terminar
        //no utilizar super.to string en estudiante presencial
        // debe esxistir un sola impresion de todos los estudinates presenciales
        // no usar arreglos
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        boolean bandera = true;
        String cadena = "";
        while (bandera) {
            
            System.out.println("Ingrese un nombre: ");
            String nombre = sc.nextLine();
            

            System.out.println("Ingrese un apellido ");
            String apellido = sc.nextLine();

            System.out.println("Ingrese una identificacion");
            String identificacion = sc.nextLine();

            System.out.println("Ingrese edad");
            int edad = sc.nextInt();

            System.out.println("Ingrese el numero de creditos: ");
            int numCosto = sc.nextInt();

            System.out.println("Ingrese el coto de creditos: ");
            double cosCred = sc.nextInt();
            
            
            System.out.println("Ingrese 1 para poder salir: ");
            int opcion = sc.nextInt();
            

            EstudiantePresencial esp = new EstudiantePresencial(nombre,
                    apellido, identificacion, edad, numCosto, cosCred);

            esp.calcularMatriculaPresencial();

            System.out.println(esp);
            
            cadena = String.format("%s\n%s", cadena, esp);

            
            if(opcion==1){
                
                bandera = false;
            
            }
            

        }
        System.out.println(cadena);
    }

}
