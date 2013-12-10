package Minggu6;
public class Mahasiswa implements Comparable {
    private String nama;
    private int nim;

    Mahasiswa() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    @Override
    public int compareTo(Object t) {
        if (getNim() == ((Mahasiswa) t).getNim()) {
            return 0;
        } else if (getNim() < ((Mahasiswa) t).getNim()) {
            return -1;
        } else {
            return 1;
        }
//        return nim -((Mahasiswa)t).nim;
    }
}
