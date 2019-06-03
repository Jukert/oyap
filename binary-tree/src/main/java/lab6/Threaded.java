package lab6;

import java.util.LinkedList;
import java.util.Queue;

public class Threaded {

    static Node root;

    static Node createThreaded(Node root) {
        if (root == null)
            return null;
        if (root.left == null &&
                root.right == null)
            return root;

        if (root.left != null) {
            Node l = createThreaded(root.left);
            l.right = root;
            l.isThreaded = true;
        }

        if (root.right == null)
            return root;

        // Recur for right subtree.
        return createThreaded(root.right);
    }

    static Node leftMost(Node root) {
        while (root != null && root.left != null)
            root = root.left;
        return root;
    }

    static void inOrder(Node root) {
        if (root == null) return;

        Node cur = leftMost(root);

        while (cur != null) {
            System.out.print(cur.key + " ");

            if (cur.isThreaded)
                cur = cur.right;

            else
                cur = leftMost(cur.right);
        }
    }


    static Node newNode(int key) {
        Node temp = new Node();
        temp.left = temp.right = null;
        temp.key = key;
        return temp;
    }

    static class Node {
        int key;
        Node left, right;

        boolean isThreaded;
    }
}
