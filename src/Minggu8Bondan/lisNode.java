/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu8Bondan;

/**
 *
 * @author admin
 */
public class lisNode {

    private int data;
    private lisNode Kanan;

    public lisNode(int data) {

        this.data = data;
        Kanan = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public lisNode getKanan() {
        return Kanan;
    }

    public void setKanan(lisNode Kanan) {
        this.Kanan = Kanan;
    }
}
