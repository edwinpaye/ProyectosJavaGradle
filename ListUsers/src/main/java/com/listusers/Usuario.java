package com.listusers;

public class Usuario {
    
    private String id_user;
    private String position;
    private String name;
    private String lastName;
    private int salary;
        
    public Usuario() { }
    
    public Usuario(String id_user,String position,String name,String lastName, int salary) {
        this.id_user = id_user;
        this.position = position;
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }
   
    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}
