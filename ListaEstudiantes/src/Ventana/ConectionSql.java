package Ventana;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectionSql {

    private String user,password, directionIp;
    
    public ConectionSql(String user,String password, String directionIp) {
        this.user=user;
        this.password = password;
        this.directionIp = directionIp;
    }
    
    public Connection getConnection(){
        try{
            //obtenemos el driver de para mysql
            Class.forName("com.mysql.jdbc.Driver");
            //obtenemos la conexión
            return DriverManager.getConnection(directionIp,user,password);
//            if (connection!=null){
//               System.out.println("Conexión a base de datos Usuario OK\n");
//            }
        }
        catch(SQLException e){
           System.out.println(e);
        }catch(ClassNotFoundException e){
           System.out.println(e);
        }catch(Exception e){
           System.out.println(e);
        }
        return null;
    }
    
//    public boolean isConnected(Connection newConnection) {
//        try{
//            if (newConnection.isClosed()) {
//                System.out.println("La base de datos esta apagada");
//                return false;
//            }
//        }catch (Exception e) {
//            System.out.println("No se pudo estableder coneccion " + e.getMessage());
//            e.getStackTrace();
//        }
//        return true;
//    }
    
//    public Connection Connect(){
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            return DriverManager.getConnection("jdbc:mysql://"+directionIp+"/USUARIO",this.user,this.password);
//        } catch (Exception e) {
//            System.out.println("Connection SQL fail"+e.getMessage());
//        }
//        System.out.println("Coneccion realizada");
//        try {
//                Class.forName("com.mysql.jdbc.Driver");
//                return DriverManager.getConnection("jdbc:mysql://localhost:3306/USUARIO","root","root");
//            } catch (SQLException ex) {
//                throw new SQLException(ex);
//            } catch (ClassNotFoundException ex) {
//                throw new ClassCastException(ex.getMessage());
//            }
//        return null;
//    }
    
//    public Connection getConection(){
//        return myConnection;
//    }
    
//    public void setConnection(Connection newConnection){
//        myConnection = newConnection;
//    }
    
//    public static void cerrar() throws SQLException {
//        if (myConnection != null) {
//           myConnection.close();
//        }
//    }
    
//    public void CloseConnection(){
//        myConnection.close();
//        myConnection = null;
//    }

//    public void cerrarConexion() throws SQLException {
//        try {
//            myConnection.close();
//        }catch (SQLException  sqle) {
//            throw new ConnectionException("Ha ocurrido un error al intentar cerrar la conexion con la BBDD. Error:" + sqle.getMessage());
//        }
//    }
    
//    public static void main(String[] args) {
//       
//        ConectionSql conexion = new ConectionSql("root", "root", "localhost:3306");
//        conexion.Connect();
//        conexion.CloseConnection();
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