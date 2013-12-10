//Tugas Struktur Data 1
//Nama: Engelbertus Vione
//NIM:125314112
package Minggu9;

public class List {

    private ListNode head;
    private int size;

    public ListNode getHead() {
        return head;
    }

    public void setHead(ListNode head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List() {
        head = new ListNode();
        head.setNext(head);
        head.setPrev(head);
    }

    private void addBefore(int size, ListNode head) {
        ListNode baru = new ListNode(size);
        baru.setNext(head);
        baru.setPrev(head.getPrev());
        head.getPrev().setNext(baru);
        head.setPrev(baru);
        setSize(getSize() + 1);
    }

    private ListNode remove(ListNode head) {
        ListNode point = head;
        point.getPrev().setNext(point.getNext());
        point.getNext().setPrev(point.getPrev());
        setSize(getSize() + 1);
        return point;
    }

    public void addFirst(int data) {
        addBefore(data, head.getNext());
    }

    public void addLast(int data) {
        addBefore(data, head);
    }

    public ListNode removefirst() {
        return remove(head.getNext());
    }

    public ListNode removeLast() {
        return remove(head.getPrev());
    }

    public void cetak() {
        ListNode pointer = head.getNext();
        while (pointer != head) {
            System.out.print(" " + pointer.getData() + " ");
            pointer = pointer.getNext();
        }
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public boolean search(int data) {
        for (ListNode i = head.getNext(); i != head; i = i.getNext()) {
            if (i.getData() == data) {
                return true;
            }
        }
        return false;
    }
}
