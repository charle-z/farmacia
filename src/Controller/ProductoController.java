
package Controller;

import Model.ConexionDB;
import Model.ProductoModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductoController {
    //  CREAMOS ATRIBUTO TIPO CLASE ConexionBD
    static ConexionDB objConexionDB = new ConexionDB();
    
//    ProductoModel objProductoModel = new ProductoModel();

    public ProductoController() {
    }
//    //CREO SETTER AND GETTER PARA EL ATRIBUTO PRODUCTOMODEL
//
//    public ProductoModel getObjProductoModel() {
//        return objProductoModel;
//    }
//
//    public void setObjProductoModel(ProductoModel objProductoModel) {
//        this.objProductoModel = objProductoModel;
//    }
    

    //CREAR LOS METODOS PARA EL CRUD
     //METODO LISTAR
    public ResultSet listarAll(){
        //CREAMOS LA CONSULTA SQL
        String scriptSql = "SELECT * FROM tb_Producto";
        
        try {
            PreparedStatement pstm = objConexionDB.conexion().prepareStatement(scriptSql);
            ResultSet respuestaConsulta = pstm.executeQuery();
            return respuestaConsulta;
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }   
   //METODO CREAR 
    public int crear(int id, String nombre){
        String scriptSql = String.format("INSERT INTO tb_Producto(id, nombre, temperatura, valorBase, costo)VALUES(%s,'%s', %s, %s, %s);", id, nombre);        
        try {
            PreparedStatement pstm = objConexionDB.conexion().prepareStatement(scriptSql);
            pstm.execute();
            return 1;
            
        } catch (Exception e) {
            System.err.println(e);
            return 0;
        }
    }
    //METODO ACTUALIZAR  
    public boolean update(){
        String scriptSql = "UPDATE tb_Producto SET nombre = 'Paracetamol', valorBase=100.0 ,costo = 110.0 WHERE id=23;";        
        try {            
            PreparedStatement pstm = objConexionDB.conexion().prepareStatement(scriptSql);
            pstm.execute();
            return true;           
        } catch (Exception e) {
            System.err.println(e);
            return false;
        }
    }
   //METODO ELIMINAR 
    public int delete(String nombre,String tamano){
        String scriptSql = "DELETE FROM tb_Producto WHERE id = 23;";        
        try {   
            PreparedStatement pstm = objConexionDB.conexion().prepareStatement(scriptSql);
            pstm.execute();
            return 1;           
        } catch (Exception e) {
            System.err.println(e);
            return 0;
        }
    }
}
