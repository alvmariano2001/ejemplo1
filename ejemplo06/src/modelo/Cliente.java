package modelo;
/**
 *
 * @author epam11
 */
public class Cliente {
    private Integer id_cliente;
    private String apellido;
    private String nombre;
    private Integer edad;
    private Integer dni;
    
    public Cliente(String apellido, String nombre, Integer edad, Integer dni){
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.id_cliente = null;
    }

    public Cliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }
    
    
    public String ToString(){
        return "cliente{" + "id_cliente=" + id_cliente + ", apellido=" + apellido + ", nombre=" + nombre + ", edad=" + edad + " }"; 
        
    }
    
    
    
    
    
}
