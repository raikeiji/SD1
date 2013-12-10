package MInggu10;

public class TestQueue_DoubleLinkedList {

    public static void main(String[] args) {
        Queue_DoubleLinkedList que = new Queue_DoubleLinkedList();
        que.enqueue(20);
        que.enqueue(5);
        que.enqueue(69);

        while (!que.isEmpety()) {
            System.out.println(que.dequeue());
        }
    }
}
