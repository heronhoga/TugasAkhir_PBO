/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbogui;

/**
 *
 * @author afrin
 */
public class DataKasir {
    final private String [] userName = {"Zidane1", "Ibnu2", "Hoga3"};
    final private String [] passWord = {"zidaneprogamer","ibnuthebeast", "hogabertarung"};
    
    public String getUsername(int index) {
        return userName[index];
    }
    
    public String getPassword (int index) {
        return passWord[index];
    }
}
