package MInggu10;

public class QueueStatic_Berputar {

    private int[] element;
    private int front, size, rear;

    public QueueStatic_Berputar() {
    }

    public QueueStatic_Berputar(int ukuran) {

        element = new int[ukuran];
        size = 0;
        front=0;
        rear = 0;
    }

    public boolean enqueue(int data) {
        if (!isFull()) {
            this.element[rear] = data;
            if (rear+1==element.length) rear=0;
            else rear++;
            size++;
            return true;
        } else {
            return false;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Antrian kosong");
        }
        int temp = element[front];
        if (front+1==element.length) front=0;
        else front++;
        
        size--;
        return temp;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private boolean isFull() {
        return size == element.length;
    }
}
