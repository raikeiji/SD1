/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mnggu4.jay;

/**
 *
 * @author hp
 */
public class Mahasiswa implements Comparable {
    private int nim;
    private String nama;
    public Mahasiswa(){
    }
    public Mahasiswa(String nama, int nim) {
        this.nim = nim;
        this.nama = nama;
    }
    public int getNim() {
        return nim;
    }
    public void setNim(int nim) {
        this.nim = nim;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    @Override
    public int compareTo(Object o) {
        if (getNim() == ((Mahasiswa) o).getNim()) {
            return 0;
        } else if (getNim() < ((Mahasiswa) o).getNim()) {
            return -1;
        } else {
            return 1;
        }
    }
}
