/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete8;

/**
 *
 * @author salas
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        EstudiantePresencial esp = new EstudiantePresencial("Carlos","SALAS",
                "110",18,12,5);
        
        esp.calcularMatriculaPresencial();
        
        System.out.println(esp);
    }
    
}
