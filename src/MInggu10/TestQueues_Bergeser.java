/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MInggu10;

/**
 *
 * @author made
 */
public class TestQueues_Bergeser {

    public static void main(String[] args) {
        QueueStatic_Bergeser q = new QueueStatic_Bergeser(3);
        System.out.println("");
        q.enqueue(2);
        q.enqueue(3);
        // q.enqueue(2);
        //q.dequeue();
        while (!q.isEmpty()) {
            System.out.println(q.dequeue());
        }

    }
}
