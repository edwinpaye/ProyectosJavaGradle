package Ventana;

import java.util.ArrayList;

public class ListUsuarios extends Autenticacion{

    private ArrayList<Usuario> list;

    public ListUsuarios(UserManager userManager) {
        this.list = userManager.ShowUsers();
    }

    public ArrayList<Usuario> getActual(){
        return list;
    }

    public void setLista(ArrayList<Usuario> listUsuario){
        this.list = listUsuario;
    }

    public ArrayList<Usuario> searchAllUserData(String date){
        ArrayList<Usuario> auxiliar = new ArrayList<Usuario>();
        for (int i = 0; i < list.size(); i++) {
            if (searchUserData(i, date)) {
                auxiliar.add(list.get(i));
            }
        }
        return auxiliar;
    }

    public boolean searchUserData(int posicion, String date){
        if (compareName(posicion, date) || compareLastName(posicion, date) || 
            compareAddress(posicion, date) || compareSalary(posicion, date) || compareID(posicion, date)) {
            return true;
        }
        return false;
    }

    public boolean compareName(int posicionUser, String date){
        return list.get(posicionUser).getName().contentEquals(date);
    }

    public boolean compareLastName(int posicionUser, String date){
        return list.get(posicionUser).getLastName().contentEquals(date);
    }

    public boolean compareAddress(int posicionUser, String date){
        return list.get(posicionUser).getDirection().contentEquals(date);
    }

    public boolean compareSalary(int posicionUser, String date){
        return list.get(posicionUser).getSueldo().contentEquals(date);
    }
    
    public boolean compareID(int posicionUser, String date){
        return list.get(posicionUser).getAge().contentEquals(date);
    }
}
