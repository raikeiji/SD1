/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu8;

/**
 *
 * @author admin
 */
public class ListNode {
        private int data;
        private ListNode kanan;

    public ListNode(int data) {
        this.data=data;
        kanan=null;
    }

//    public ListNode(int data, ListNode kanan) {
//        this.data = data;
//        this.kanan = kanan;
//    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getkanan() {
        return kanan;
    }

    public void setkanan(ListNode kanan) {
        this.kanan = kanan;
    }
   
}
