/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbogui;

/**
 *
 * @author afrin
 */
public class DaftarMakanan extends DaftarPesanan {
private int paket1 = 18000;
private int paket2 = 15000;
private int paket3 = 13000;
private int nasiTambah = 5000;
private int kentang = 10000;

public double nilaiPajakPesan() {
        return 1.05;
    } 
//SETTER PAKET 1
public void setHargaPaket1(int paket1input) {
    paket1 = paket1input;
}

//SETTER PAKET 2
public void setHargaPaket2(int paket2input) {
    paket2 = paket2input;
}

//SETTER PAKET 3
public void setHargaPaket3(int paket3input) {
    paket3 = paket3input;
}

//SETTER NASI TAMBAH
public void setHargaNasiTambah(int nasiTambahInput) {
    nasiTambah = nasiTambahInput;
}

//SETTER KENTANG
public void setHargaKentang(int paket1input) {
    paket1 = paket1input;
}

public int getPaket1() {
    return paket1;
}

public int getPaket2() {
    return paket2;
}

public int getPaket3() {
    return paket3;
}

public int getNasiTambah() {
    return nasiTambah;
}

public int getKentang() {
    return kentang;
}

}
