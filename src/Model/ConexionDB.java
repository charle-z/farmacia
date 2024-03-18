
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexionDB {

    //CREO UNA VARIABLE PARA LA CADENA DE CONEXION
    String strConexionDB = "jdbc:sqlite:C:/db/db_Producto.db";

    //CREO UN ATRIBUTO DE TIPO CONEXION
    Connection miConexion = null;

    public ConexionDB() {
//        try {
//            //CREO UNA REFERENCIA PARA GESTIONAR CONEXION
//            Class.forName("org.sqlite.JDBC");
//            miConexion = DriverManager.getConnection(strConexionDB);
//            System.out.println("Conexion a la BD correctamente.");
//        } catch (Exception e) {
//            //System.out.println("No se pudo conectar a la BD.");
//            JOptionPane.showMessageDialog(null, e.getMessage().toString());
//        }

    }
    
    //CREAMOS EL METODO DE CONEXION QUE EJECUTARÁ EL CRUD
    public Connection conexion(){
        try {
            Class.forName("org.sqlite.JDBC");
            miConexion = DriverManager.getConnection(strConexionDB);
            return miConexion;
        } catch (Exception e) {
            return null;
        }  
    }
}

