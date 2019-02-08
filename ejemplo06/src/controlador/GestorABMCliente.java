/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import vista.PantallaCliente;
import modelo.Cliente;
/**
 *
 * @author riodajs
 */
public class GestorABMCliente {

    public GestorABMCliente() {
    }
    public void run(){
        PantallaCliente cliente = new PantallaCliente();
        cliente.setVisible(true);
    }
    
    private final String tabla = "cliente";
    public void guardar(Connection conexion, Cliente cliente) throws SQLException{
        try{
            PreparedStatement consulta;
            if(cliente.getId_cliente() == null){
                System.out.println("//Insert");
                consulta = conexion.prepareStatement("INSERT INTO cliente VALUES (DEFAULT, ?, ?, ?, ?)");
                //consulta.setInt(1, cliente.getId_cliente());
                consulta.setString(1, cliente.getApellido());
                consulta.setString(2, cliente.getNombre());
                consulta.setInt(3, cliente.getEdad());
                consulta.setInt(4, cliente.getDni());
                System.out.println("Insert//");
            }else{
                System.out.println("//Update");
                consulta = conexion.prepareStatement("UPDATE cliente SET apellido = ?, nombre = ?, edad = ?, dni = ? WHERE 'id-cliente' = ?");
                consulta.setString(1, cliente.getApellido());
                consulta.setString(2, cliente.getNombre());
                consulta.setInt(3, cliente.getEdad());
                consulta.setInt(4, cliente.getDni());
                consulta.setInt(5, cliente.getId_cliente());
                System.out.println("Update//");
            }
            
            consulta.executeUpdate();
            
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
    }
}

