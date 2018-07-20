package Ventana;

import java.util.ArrayList;

public class ListUsuarios extends Autenticacion{
    
//    private Autenticacion autent = new Autenticacion();
    private ArrayList<Usuario> list;

    public ListUsuarios() {
        this.list = new ArrayList<Usuario>();
    }
    
    public ListUsuarios(ArrayList<Usuario> listUser){
        this.list = listUser;
    }
    
    public void AddUser(String name, String lastName, String age, String ocupation){
        if (CheckString(name) && CheckString(lastName) && checkInt(age) && CheckString(ocupation)) {
            list.add(new Usuario(name, lastName, age, ocupation, String.valueOf(list.size()+1)));
        }
    }
    
    public ArrayList<Usuario> getActual(){
        return list;
    }
    
    public void setLista(ArrayList<Usuario> listUsuario){
        this.list = listUsuario;
    }
    
}
