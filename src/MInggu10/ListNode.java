package MInggu10;

public class ListNode {

    int elemen;
    ListNode next;
    ListNode prev;

    public ListNode() {
    }

    public ListNode(int elemen) {
        this.elemen = elemen;
    }

    public ListNode(int elemen, ListNode next, ListNode prev) {
        this.elemen = elemen;
        this.next = next;
        this.prev = prev;
    }
}
