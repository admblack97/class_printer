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
public class printer {
    //atribut
    String merek;
    String jenis;
    String kertas;
    String konek;
    String fitur;
    String warna;
    String tinta;
    
    //behavior
    void CetakKertas(){
        System.out.println("Merek printer          : "+merek);
        System.out.println("Jenis printer          : "+jenis);
        System.out.println("Jenis kertas printer   : "+kertas);
        System.out.println("Konektivitas printer   : "+konek);
        System.out.println("Fitur tambahan printer : "+fitur);
        System.out.println("Warna printer          : "+warna);
        System.out.println("Jenis tinta printer    : "+tinta+"\n");
    }
}
