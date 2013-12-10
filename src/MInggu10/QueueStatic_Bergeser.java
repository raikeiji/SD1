package MInggu10;

public class QueueStatic_Bergeser {

    private int[] element;
    private int size, rear;

    public QueueStatic_Bergeser() {
    }

    public QueueStatic_Bergeser(int ukuran) {

        element = new int[ukuran];
        size = 0;
        
        rear = 0;
    }

    public boolean enqueue(int data) {
        if (!isFull()) {
            this.element[rear] = data;
            rear++;
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
        int temp = element[0];
        for (int i = 1; i < rear; i++) {
            element[i - 1] = element[i];

        }
        rear--;
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
