/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119067.latihan62.living.thing;

/**
 *
 * @author Danhago
 * NAMA     : Andreas Danhago P.I
 * KELAS    : IF2
 * NIM      : 10119067
 * Deskripsi: Living Thing
 */
public class PBOIF210119067Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human h = new Human();
        h.setNama("Rizki Adam Kurniawan");
        h.walk(h.getNama());
        h.breath(h.getNama());
        h.eat(h.getNama());
    }
    
}
