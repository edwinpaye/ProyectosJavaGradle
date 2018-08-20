package com.listusers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionSql {

    private String user;
    private String password;
    private String directionIp;

    public ConectionSql(String user,String password, String directionIp) {
        this.user=user;
        this.password = password;
        this.directionIp = directionIp;
    }

    public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(directionIp,user,password);
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

}
