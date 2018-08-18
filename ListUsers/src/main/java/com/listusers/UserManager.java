package com.listusers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UserManager {
private ConectionSql conn;
    private PreparedStatement miSentencia = null;
    private ResultSet resultado = null;

    public UserManager(ConectionSql newConectionSql){
        conn = newConectionSql;
    }

    public void ConnectedQueryPrepared(String consulta){
        try {
            miSentencia = conn.getConnection().prepareStatement(consulta);
        } catch (Exception e) {
            MessageEmergent("ConnectedQueryPrepared() fail "+e.getMessage());
        }
    }

//    public ResultSet PreparedStatementQuery(String buscarapp){
//        try {
//            ConnectedQueryPrepared("select cargo, nombre, apellido, sueldo from dato_empleado where apellido=?");
//            miSentencia.setString(1, buscarApp);
//            return  miSentencia.executeQuery();
//        } catch (Exception e) {
//            System.out.println("Error en respuesta Busqueda! "+e.getMessage());
//        }
//        return null;
//    }

    private Statement ConnectWithAllUsers() {
        try {
            return conn.getConnection().createStatement();
        } catch (Exception e) {
            MessageEmergent("ConnectWithAllUsers() fail "+e.getMessage());
        }
        return null;
    }

    private ResultSet ExecuteConnectionQuery(String query) {
        try {
            return ConnectWithAllUsers().executeQuery(query);
        } catch (Exception e) {
            MessageEmergent("ExecuteConnectionQuery() fail "+e.getMessage());
        }
        return null;
    }

    public ArrayList<Usuario> ShowUsers(){
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        try {
            resultado = ExecuteConnectionQuery("select * from dato_empleado");
            while(resultado.next()){
                lista.add(new Usuario(resultado.getString(1), resultado.getString(2), resultado.getString(3), resultado.getString(4), resultado.getInt(5)));
            }
            return lista;
        } catch (Exception e) {
            MessageEmergent("ShowUsers() fail "+e.getMessage());
        }
        return lista;
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
            MessageEmergent("Add user: "+nombre+" "+app);
        } catch (Exception e) {
            MessageEmergent("AddUser() fail "+e.getMessage());
        }
    } 

    public void RemoveUser(String deleteUser){
        try {
            ConnectedQueryPrepared("DELETE FROM dato_empleado where id_usuario=?");
            miSentencia.setString(1, deleteUser);
            miSentencia.executeUpdate();
            MessageEmergent("User Deleted");
        } catch (Exception e) {
            MessageEmergent("RemoveUser() fail"+e.getMessage());
        }
    }

    public void EditUser(String id_usuarioEdit,String id_usuario,String cargo,String nombre,String app,int salario){
        try {
            ConnectedQueryPrepared("UPDATE dato_empleado SET id_usuario= ?, cargo= ?, nombre= ?, apellido= ?, sueldo= ? WHERE id_usuario= ?");
            miSentencia.setString(1, id_usuario);
            miSentencia.setString(2, cargo);
            miSentencia.setString(3, nombre);
            miSentencia.setString(4, app);
            miSentencia.setInt(5, salario);
            miSentencia.setString(6, id_usuarioEdit);
            miSentencia.executeUpdate();
            MessageEmergent("Edit User: "+nombre+" "+app);
        } catch (Exception e) {
            MessageEmergent("EditUser() fail "+e.getMessage());
        }
    }

    public void MessageEmergent(String message){
        JOptionPane.showMessageDialog(null, message);
    }
    
}
