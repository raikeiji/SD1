/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu8Bondan;

/**
 *
 * @author admin
 */
public class Senarai {

    public static void main(String[] args) {
      linkList link = new linkList();
      link.addPertama(56);
      link.addPertama(3);
      link.addPertama(8);
      link.addPertama(20);
      link.addTerakhir(88);
        System.out.println();
        link.cetak();
    }
}
