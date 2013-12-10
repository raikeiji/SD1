package MInggu10;

public class Queue_DoubleLinkedList {

    private LinkedList antrian;
    private int size;

    public Queue_DoubleLinkedList() {
        antrian = new LinkedList();
    }

    public void enqueue(int elemen) {
        antrian.addLast(elemen);
        size++;
    }

    public int dequeue() {
        size--;
        return antrian.removeFirst();
    }

    public boolean isEmpety() {
        return antrian.isEmpty();
    }
}
