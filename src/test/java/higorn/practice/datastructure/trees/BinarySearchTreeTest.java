package higorn.practice.datastructure.trees;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;


/**
 * Created by higor on 17/04/18.
 */
public class BinarySearchTreeTest {

    @Test
    public void itShoudCountDuplicates() {
        Node root = new Node(4);
        root.insert(2);
        root.insert(6);
        root.insert(1);
        root.insert(3);
        root.insert(5);
        root.insert(7);
        Assert.assertTrue(BinarySearchTree.isBst(root));
    }

    @Test
    public void itShoudCountDuplicatesCase2() {
        Node root = new Node(3);
        root.insert(2);
        root.insert(1);
        root.insert(4);
        root.insert(6);
        root.insert(5);
        root.insert(7);
        Assert.assertTrue(BinarySearchTree.isBst(root));
    }

    @Test
    public void itShoudCountDuplicatesCase3() {
        Node root = new Node(3);
        root.left = new Node(4);
        root.insert(2);
        root.insert(1);
        root.insert(6);
        root.insert(5);
        root.insert(7);
        Assert.assertFalse(BinarySearchTree.isBst(root));
    }

    @Test
    public void itShoudCountDuplicatesCase4() {
        Node root = new Node(3);
        root.right = new Node(2);
        root.insert(4);
        root.insert(1);
        root.insert(6);
        root.insert(5);
        root.insert(7);
        Assert.assertFalse(BinarySearchTree.isBst(root));
    }
}
