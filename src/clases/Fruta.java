
package clases;


public class Fruta {
    
    public String nombre;
    public double precio;
    public double total;

    public Fruta(String nombre, double precio) {
        
        this.nombre = nombre;
        this.precio = precio;
        
    }
    
    public double getPrecio(int cantidad){
        
        double iva = 0.16;
        
        total = cantidad * precio;
        total += total*iva;
        
        return total;
        
    }
    
}
