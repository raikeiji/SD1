/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MInggu10;

/**
 *
 * @author made
 */
public class TestQueues_Berputar {

    public static void main(String[] args) {
        QueueStatic_Berputar q = new QueueStatic_Berputar(3);
        
        q.enqueue(2);
        q.enqueue(3);
        // q.enqueue(2);
        //q.dequeue();
        while (!q.isEmpty()) {
            System.out.println(q.dequeue());
        }

    }
}
