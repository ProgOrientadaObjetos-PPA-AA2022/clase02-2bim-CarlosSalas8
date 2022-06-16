
package paquete4;


public class Ejecutor2 {
    public static void main(String[] args) {
        //1 Crear y presentar de tipos estudinate presencial
        String nombre = "Carlos";
        String apellido = "Salas";
        String identificacion = "1101254";
        int edad = 18;
        
        EstudiantePresencial esp = new EstudiantePresencial(nombre, apellido, identificacion, edad);
        
        esp.establecerNumeroCreditos(25);
        esp.establecerCostoCredito(15);
        esp.calcularMatriculaPresencial();
        
  
        System.out.println(esp);
    }
    
}
