package Ventana;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectionSql {

    private String user,password;
    private Connection myConnection;
    
    public ConectionSql(String user,String password) {
        this.user=user;
        this.password = password;
    }
    
    public boolean isConnected() {
        try{
            if (myConnection.isClosed()) {
                System.out.println("La base de datos esta apagada");
                return false;
            }
        }catch (Exception e) {
            System.out.println("No se pudo estableder coneccion " + e.getMessage());
            e.getStackTrace();
        }
        return true;
    }
    
    public void Connect() {
        try {
            System.out.println("Coneccion realizada");
            myConnection = DriverManager.getConnection("jdbc:mysql://192.168.100.8/USUARIO",this.user,this.password);
        } catch (Exception e) {
            System.out.println("Connection fail"+e.getMessage());
        }
    }
    
    public Connection getConnection(){
        return myConnection;
    }
    
    public void setConnection(Connection newConnection){
        myConnection = newConnection;
    }
    
//    public static void cerrar() throws SQLException {
//        if (myConnection != null) {
//           myConnection.close();
//        }
//    }
    
    public void CloseConnection(){
//        myConnection.close();
        myConnection = null;
    }

//    public void cerrarConexion() throws SQLException {
//        try {
//            myConnection.close();
//        }catch (SQLException  sqle) {
//            throw new ConnectionException("Ha ocurrido un error al intentar cerrar la conexion con la BBDD. Error:" + sqle.getMessage());
//        }
//    }
    
//    public static void main(String[] args) {
//       
//        Connection conexion = new ConectionSql("root", "root").Connect();
////        conexion.Connect();
////        conexion.CloseConnection();
//    }
    
//    private static Connection cnx = null;
//    public static Connection obtener() throws SQLException, ClassNotFoundException {
//        if (cnx == null) {
//            try {
//                Class.forName("com.mysql.jdbc.Driver");
//                cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/USUARIO","root","root");
//            } catch (SQLException ex) {
//                throw new SQLException(ex);
//            } catch (ClassNotFoundException ex) {
//                throw new ClassCastException(ex.getMessage());
//            }
//        }
//        return cnx;
//    }
//    public static void cerrar() throws SQLException {
//        if (cnx != null) {
//           cnx.close();
//        }
//    }
}