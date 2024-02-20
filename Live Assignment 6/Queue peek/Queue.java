public class Queue {
  private Elem front;
  private Elem rear;
  
//contructor
  public Queue() {
    this.front = null;
    this.rear = null;
  }
  
// check if queue is empty
  public boolean isEmpty() {
    return front == null;
  }

  public void enqueue(Object data) {
    Elem newElem = new Elem(data);

    if (isEmpty()) {
      front = newElem;
      rear = newElem;
    } else {
      rear.next = newElem;
      rear = newElem;
    }
  }

  /// dequeue
  public Object dequeue(){
    if (isEmpty()) {
      return null;
    }
    Object data = front.data;
    front = front.next;

    if (front == null) {
      rear = null;
    }
    return data;
  }

  // Method to return the front element without removing it
  public Object peekFirst() {
      return isEmpty() ? null : front.data;
  }

  // Method to return the rear element without removing it
  public Object peekLast() {
      return isEmpty() ? null : rear.data;
  }

  
}