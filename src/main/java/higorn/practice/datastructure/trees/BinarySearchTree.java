package higorn.practice.datastructure.trees;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by higor on 17/04/18.
 */
public class BinarySearchTree {
    public static List<Integer> toList(Node root) {
        List<Integer> list = new ArrayList<>();
        addToList(list, root);
        return list;
    }

    private static void addToList(List<Integer> list, Node root) {
       if (root == null) {
           return;
       }
       if (root.left != null) {
           addToList(list, root.left);
       }
       list.add(root.data);
       addToList(list, root.right);
    }

    public static boolean isBst(Node root) {
        try {
            walk(root);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static int walk(Node node) throws Exception {
        if (node.left != null && node.data < walk(node.left)) {
            throw new Exception("not bst");
        }
        int val = node.data;
        if (node.right != null && node.data > walk(node.right)) {
            throw new Exception("not bst");
        }
        return val;
    }
}
