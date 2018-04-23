package higorn.practice.datastructure.trees;

/**
 * Created by higor on 17/04/18.
 */
public class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }

    public void insert(int val) {
        if (val <= data) {
            if (left == null) {
                left = new Node(val);
            } else {
                left.insert(val);
            }
        } else {
            if (right == null) {
                right = new Node(val);
            } else {
                right.insert(val);
            }
        }
    }
}
