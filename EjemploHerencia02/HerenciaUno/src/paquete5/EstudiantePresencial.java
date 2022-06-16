
package paquete5;

public class EstudiantePresencial extends Estudiante{
    
    int numeroCreditos;
    double costoCredito;
    double matriculaPresencial;
    
    //  Métodos establecer y calcular para los datos o atributos de la clase
    // 2.  Método establecerNumeroCreditos(numero: Real)
        public EstudiantePresencial(String n, String ap, String iden, int e, 
            int numCost, double cosCred){
        super(n, ap, iden, e);
        numeroCreditos = numCost;
        costoCredito = cosCred;
    }
        
    public void establecerNumeroCreditos(int numero){
        numeroCreditos = numero;
    }
    
    // 3.  Método establecerCostoCredito(valor: Real)
    public void establecerCostoCredito(double valor){
        costoCredito = valor;
    }

    // 4.  Método calcularMatriculaPresencial()
    public void calcularMatriculaPresencial(){
        matriculaPresencial = numeroCreditos * costoCredito;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroCreditos() : Entero
    public int obtenerNumeroCreditos(){
        return numeroCreditos; 
    }

    // 6. Método obtenerCostoCredito() : Real
    public double obtenerCostoCredito(){
        return costoCredito;
    }

    // 7. Método obtenerMatriculaPresencial() : Real
    public double obtenerMatriculaPresencial(){
        return matriculaPresencial;
    }
    
    @Override
    public String toString(){
        String cadenaFinal = String.format("%s", super.toString());
        
        cadenaFinal = String.format("%s\n"
                + "Numero de Creditos: %d\n"
                + "Costo de Credito: %.2f\n"
                + "Total Matricula: %.2f\n",
                cadenaFinal,
                obtenerNumeroCreditos(),
                obtenerCostoCredito(),
                obtenerMatriculaPresencial());
        
        return cadenaFinal;
    }
    
}
