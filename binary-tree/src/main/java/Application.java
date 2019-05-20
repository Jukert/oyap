import lab5.Tree;

public class Application {

    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        tree.add(7);
        tree.add(8);

        tree.traversePreOrder(tree.root);
        System.out.println();
        tree.traversePostOrder(tree.root);
        System.out.println();
        tree.traverseInOrder(tree.root);
    }
}
