/*
 * File:   MyQueue.java
 *
 * Created on 06/04/18, 21:23
 */
package higorn.practice.datastructure.queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author higor
 */
public class MyQueue<E> {
  private Queue<E> queue;

  public MyQueue() {
    queue = new ArrayDeque<>();
  }
  public void enqueue(E element) {
    queue.add(element);
  }

  public E dequeue() {
    return queue.poll();
  }

  public boolean isEmpty() {
    return queue.isEmpty();
  }

  public E peek() {
    return queue.peek();
  }
}
