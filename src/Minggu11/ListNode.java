//Tugas Struktur Data 1
//Nama: Engelbertus Vione
//NIM:125314112
package Minggu11;

public class ListNode {

    private int data;
    private ListNode Next;
    private ListNode Prev;

    public ListNode(int data) {
        this.data = data;
        Next = null;
    }

    public ListNode() {
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return Next;
    }

    public void setNext(ListNode Next) {
        this.Next = Next;
    }

    public ListNode getPrev() {
        return Prev;
    }

    public void setPrev(ListNode Prev) {
        this.Prev = Prev;
    }
}
