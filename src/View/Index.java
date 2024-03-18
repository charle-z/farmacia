
package View;

import Controller.ProductoController;
import Model.ConexionDB;
import java.sql.ResultSet;

public class Index {
        public static void main(String[] args) {
        
        //CREO UN OBJETO DE LA CLASE CONEXIONDB
        ConexionDB objConexion = new ConexionDB();
        
        ProductoController objProdutoController = new ProductoController();
        
        //ProductoController.crear();
        try {
            ResultSet resultado = objProdutoController.listarAll();
            while (resultado.next()) {                
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                int temperatura = resultado.getInt("temperatura");
                int valorBase = resultado.getInt("valorBase");
                int costo = resultado.getInt("costo");
                
                System.out.println(id + "  |  " +  nombre + "  |  "  + temperatura + "  |  " + valorBase + "  |  " + costo);
            }
        } catch (Exception e) {
        }
    }
}
