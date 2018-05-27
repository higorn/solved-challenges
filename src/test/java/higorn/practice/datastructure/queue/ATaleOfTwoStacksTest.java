/*
 * File:   ATaleOfTwoStacksTest.java
 *
 * Created on 06/04/18, 21:21
 */
package higorn.practice.datastructure.queue;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author higor
 */
public class ATaleOfTwoStacksTest {

  @Test
  public void itShouldEnqueueAndDequeue() {
    MyQueue<Integer> queue = new MyQueue<Integer>();
    Integer expected = Integer.valueOf(1);
    queue.enqueue(expected);
    Assert.assertEquals(expected, queue.dequeue());
    Assert.assertTrue(queue.isEmpty());
  }

  @Test
  public void itShouldGetFirstElement() {
    MyQueue<Integer> queue = new MyQueue<Integer>();
    Integer expected = Integer.valueOf(1);
    queue.enqueue(expected);
    Assert.assertEquals(expected, queue.peek());
    Assert.assertFalse(queue.isEmpty());
  }
}
