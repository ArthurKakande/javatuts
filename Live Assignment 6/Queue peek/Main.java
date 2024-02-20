public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue("Element1");
        queue.enqueue("Element2");
        queue.enqueue("Element3");

        System.out.println("Peek First: " + queue.peekFirst()); // Output: Peek First: Element1
        System.out.println("Peek Last: " + queue.peekLast());   // Output: Peek Last: Element3

        System.out.println("Dequeue: " + queue.dequeue());      // Output: Dequeue: Element1

        System.out.println("Peek First: " + queue.peekFirst()); // Output: Peek First: Element2
        System.out.println("Peek Last: " + queue.peekLast());   // Output: Peek Last: Element3
    }
}