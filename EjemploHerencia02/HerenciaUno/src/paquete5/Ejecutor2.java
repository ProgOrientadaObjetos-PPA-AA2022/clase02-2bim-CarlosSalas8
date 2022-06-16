
package paquete5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        
         
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
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
        
        System.out.println("Ingrese el coto de cresitos: ");
        double cosCred = sc.nextInt();
        
        EstudiantePresencial esp = new EstudiantePresencial(nombre, apellido, 
                identificacion, edad, numCosto, cosCred);
        
        esp.calcularMatriculaPresencial();
        
        System.out.println(esp);
        
    }
    
}
