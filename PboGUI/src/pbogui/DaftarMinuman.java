/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbogui;

/**
 *
 * @author afrin
 */
public class DaftarMinuman extends DaftarPesanan {
    private int esTeh = 2500;
    public int getEsTeh() {
        return esTeh;
    }
    
    public void setEsteh(int hargaEsTehInput) {
        esTeh = hargaEsTehInput;
    }
    
    public double nilaiPajakPesan() {
        return 1.01;
    }
}
