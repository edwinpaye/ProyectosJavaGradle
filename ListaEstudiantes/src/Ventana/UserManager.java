package Ventana;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class UserManager {
    
    private ConectionSql conn;
    private Statement declaración = null;
    private PreparedStatement miSentencia = null;
    private ResultSet resultado = null;
    private String buscarApp;
    
    public UserManager(ConectionSql newConectionSql){
        this.conn = conn;
    }
    
    public void ConnectedQueryPrepared(String consulta){
        if (conn.isConnected()) {
            try {
                miSentencia = conn.getConnection().prepareStatement(consulta);
            } catch (Exception e) {
                System.out.println("Error en la consulta!");
            }
        }
        else{
            System.out.println("no se pudo crear coneccion, error! ");
        }
    }
    
    public void PreparedStatementQuery(String buscarapp){
        try {
            ConnectedQueryPrepared("select cargo, nombre, apellido, sueldo from dato_empleado where apellido=?");
            miSentencia.setString(1, buscarApp);
            resultado = miSentencia.executeQuery();
        } catch (Exception e) {
            System.out.println("Error en respuesta Busqueda! "+e.getMessage());
        }
    }
    
    //este metodo uetra todos los usuarios ojo al charque
    public ArrayList<Usuario> ShowUsers(){
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        try {
            ConnectWithAllUsers();
            ExecuteConnectionQuery("select * from dato_empleado");
            while(resultado.next()){
                lista.add(new Usuario(resultado.getString(3), resultado.getString(4), resultado.getString(1), resultado.getString(2), resultado.getString(5)));
            }
            return lista;
        } catch (Exception e) {
            System.out.println("error en la coneccion usuarios");
        }
        return lista;
    }
    
    private void ConnectWithAllUsers() {
        try {
            conn.Connect();
            declaración = conn.getConnection().createStatement();
        } catch (Exception e) {
            System.out.println("error en el metodo ConnectWithAllUsers()");
        }
    }

    private void ExecuteConnectionQuery(String query) {
        try {
            ConnectWithAllUsers();
            resultado = declaración.executeQuery(query);
        } catch (Exception e) {
            System.out.println("Error en las consultas."+e.getMessage());
        }
    }
    
    public void AddUser(String id_usuario,String cargo,String nombre,String app,int salario) {
        try {
            ConnectedQueryPrepared("INSERT INTO dato_empleado"
                + " VALUES"
                + "(?,?,?,?,?)");
            miSentencia.setString(1, id_usuario);
            miSentencia.setString(2, cargo);
            miSentencia.setString(3, nombre);
            miSentencia.setString(4, app);
            miSentencia.setInt(5, salario);
            miSentencia.executeUpdate();
            System.out.println("usuario guardado con exito");            
        } catch (Exception e) {
            System.out.println("error en la adicion de usuarios"+e.getMessage());
        }
    } 
    
    public void RemoveUser(String deleteUser){
        try {
            ConnectedQueryPrepared("DELETE FROM dato_empleado where id_usuario=?");
            miSentencia.setString(1, deleteUser);
            System.out.println("Eliminado con exito");
            miSentencia.executeUpdate();
        } catch (Exception e) {
            System.out.println("error en la eliminacion del usuario"+e.getMessage());
        }
    }
    
    public void EditUser(String id_usuarioEdit,String id_usuario,String cargo,String nombre,String app,int salario){
        ConnectedQueryPrepared("UPDATE dato_empleado SET id_usuario= ?, cargo= ?, nombre= ?, apellido= ?, sueldo= ? WHERE id_usuario= ?");
        try {
            miSentencia.setString(1, id_usuario);
            miSentencia.setString(2, cargo);
            miSentencia.setString(3, nombre);
            miSentencia.setString(4, app);
            miSentencia.setInt(5, salario);
            miSentencia.setString(6, id_usuarioEdit);
            miSentencia.executeUpdate();
            System.out.println("usuario editado con exito");
        } catch (Exception e) {
            System.out.println("error en la edicion de usuario"+e.getMessage());
        }
    }
}
