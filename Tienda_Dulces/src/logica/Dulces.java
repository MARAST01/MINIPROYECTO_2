package logica;
public class Dulces {
    private Categoria categoria;
    private String nombre;
    private int codigo;
    private double precio;
    
    // Constructor de la clase
    public Dulces(Categoria categoria, String nombre, int codigo, double precio) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }
    
    // Getters y Setters
    public Categoria getCategoria() {
        return categoria;
    }
    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}