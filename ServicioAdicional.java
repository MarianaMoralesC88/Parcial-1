package co.edu.uniquindio.devplus;

public class ServicioAdicional {
    private string codigo;
    private string nombre;
    private string descripcion;
    private double precio;
    private boolean disponible;

    public ServicioAdicional(sting codigo, string nombre,
                             string descripcion, double precio, boolean disponible){
        this.codigo = codigo;
        this.nombre = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.disponible = disponible;
    }

    public string getCodigo(){
        return codigo;
    }

    public void setCodigo(string codigo){
        this.codigo = codigo;
    }

    public string getNombre() {
        return nombre;
    }
    public void setNombre(string nombre){
        this.nombre = nombre;
    }
    public string getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(string descripcion){
        this.descripcion = descripcion;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public boolean isDisponible(){
        return disponible;
    }
    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }
}