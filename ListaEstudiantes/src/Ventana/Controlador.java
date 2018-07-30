package Ventana;

public class Controlador {
    
    public void Start(String newUserName, String newPassword, String newDirectionIp){
        executeWindows(new FormasDeInterfaz(new ConectionSql(newUserName, newPassword, newDirectionIp)));
    }

    private void executeWindows(FormasDeInterfaz newFormasDeInterfaz){
        newFormasDeInterfaz.setVisible(true);
    }

}
