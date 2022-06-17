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
public class EstudiantePresencial extends Estudiante {
    
    
    private int numeroCreditos;
    private double costoCreditos;
    private double matriculaPresencial;
    
    public EstudiantePresencial(String n, String ap, String iden, int e,
            int numCred, double costoCred){
        super(ap, iden, e);// ap = apellido // iden = identificacion // e = edad
        
        establecerNombresEstudiante(n);
        establecerApellidoEstudiante(ap);
        numeroCreditos = numCred;
        costoCreditos = costoCred;
    }
    
    @Override
    
    public void establecerApellidoEstudiante(String ape){
        apellidosEstudiante = ape.toLowerCase();
    }
    
    // 2.  Método establecerNumeroAsginaturas(numero: Real)
    public void establecerNumeroCreditos(int numero){
        numeroCreditos = numero;
    }
    
    // 3.  Método establecerCostoAsignatura(valor: Real)
    public void establecerCostoCreditos(double valor){
        costoCreditos = valor;
    }

    // 4.  Método calcularMatriculaDistancia()
    public void calcularMatriculaPresencial(){
        matriculaPresencial = numeroCreditos * costoCreditos;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroAsignaturas() : Entero
    public int obtenerNumeroCreditos(){
        return numeroCreditos; 
    }

    // 6. Método obtenerCostoAsignatura() : Real
    public double obtenerCostoCreditos(){
        return costoCreditos;
    }

    // 7. Método obtenerMatriculaDistancia() : Real
    public double obtenerMatriculaPresencial(){
        return matriculaPresencial;
    }
    
    @Override
    public String toString(){
        
        String cadenaFinal = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Identificación: %s\n"
                + "Edad: %s\n"
                + "Costo Credito: %.2f\n"
                + "Número de Creditos: %d\n"
                + "Total Matricula: %.2f\n",
                nombresEstudiante,
                apellidosEstudiante,
                identificacionEstudiante,
                edadEstudiante,
                obtenerCostoCreditos(),
                obtenerNumeroCreditos(),
                obtenerMatriculaPresencial());
        
        return cadenaFinal;
    }

}
