
package Model;

public class ProductoModel {
    //1. ATRIBUTOS
    public int id;
    public String nombre;
    public int temperatura;
    public int valorBase;
    public int costo;
    
    //2. CONSTRUCTOR

    public ProductoModel(int id, String nombre, int temperatura, int valorBase, int costo) {
        this.id = id;
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.valorBase = valorBase;
        this.costo = costo;
    }

    public ProductoModel() {
    }
    
    //3. METODOS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getValorBase() {
        return valorBase;
    }

    public void setValorBase(int valorBase) {
        this.valorBase = valorBase;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
}
