package lab6;

import static lab6.Threaded.*;

public class Application {
    public static void main(String[] args) {
        /**  1
            / \
           2   3
          / \ / \
         4  5 6  7   */
        Threaded.Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);
        root.right.left = newNode(6);
        root.right.right = newNode(7);

        createThreaded(root);
        System.out.println("Inorder traversal of created "+"threaded tree is\n");
        inOrder(root);
    }
}
