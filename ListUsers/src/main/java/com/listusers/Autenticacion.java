package com.listusers;

import javax.swing.JOptionPane;

public class Autenticacion {
    
    public Autenticacion(){}
    
    public boolean CheckString(String typeText){
        for (int i = 0; i < typeText.length(); i++) {
            if (!Character.isAlphabetic(typeText.charAt(i))) {
                ErrorMessage(typeText, "alfabetico");
                return false;
            }
        }
        return true;
    }
    
    public boolean checkInt(String typeText){
        for (int i = 0; i < typeText.length(); i++) {
            if (!Character.isDigit(typeText.charAt(i))) {
                ErrorMessage(typeText, "numerico");
                return false;
            }
        }
        return true;
    }

    private boolean textFilter(String typeText, boolean function){
        for (int i = 0; i < typeText.length(); i++) {
            if (function) {
                return false;
            }
        }
        return true;
    }

    private void ErrorMessage(String typeText, String textType){
        JOptionPane.showMessageDialog(null, "El dato "+typeText+" deve ser "+textType);
    }
    
}
