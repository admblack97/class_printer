/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_printer;

/**
 *
 * @author Adam Morseleno
 */
public class printerAksi {
    public static void main(String[] args) {
        printer Adam = new printer();
        System.out.println("====== Printer Adam ====== ");
        Adam.merek="Epson L605.";
        Adam.jenis="Ink Tank.";
        Adam.kertas="A3,A3+,A4.";
        Adam.konek="Wifi, Wifi Direct, Ethernet, USB.";
        Adam.fitur="Scanner, Fax.";
        Adam.warna="Hitam.";
        Adam.tinta="CMYK.";
        
        Adam.CetakKertas();
        
        printer Imam = new printer();
        System.out.println("====== Printer Imam ====== ");
        Imam.merek="Epson L310.";
        Imam.jenis="Ink Tank.";
        Imam.kertas="A3,A3+,A4.";
        Imam.konek="USB.";
        Imam.fitur="Tidak ada.";
        Imam.warna="Hitam.";
        Imam.tinta="CMYK. ";
        
        Imam.CetakKertas();
        
        printer Kevin = new printer();
        System.out.println("====== Printer Kevin ====== ");
        Kevin.merek="Epson L605.";
        Kevin.jenis="Ink Tank.";
        Kevin.kertas="A4, Letter.";
        Kevin.konek="Wifi, USB.";
        Kevin.fitur="Scanner.";
        Kevin.warna="Hitam.";
        Kevin.tinta="CMYK. ";
        
        Kevin.CetakKertas();
    }
}
