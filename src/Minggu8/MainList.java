/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu8;

/**
 *
 * @author admin
 */
public class MainList {
    public static void main(String[] args) {
        linkList l=new linkList();
        l.addPertama(2);
      //  l.addterakhir(3);
        l.addPertama(4);
        l.addterakhir(67);
        //System.out.println(l.cetak());
        l.cetak();
    }
}
