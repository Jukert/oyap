import lab5.Tree;

public class Application {

    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.add(10);
        tree.add(21);
        tree.add(3);
        tree.add(48);
        tree.add(5);
        tree.add(16);
        tree.add(17);
        tree.add(8);
        tree.printLevelOrder();

        tree.traversePreOrder(tree.root);
        System.out.println();
        tree.traversePostOrder(tree.root);
        System.out.println();
        tree.traverseInOrder(tree.root);
    }
}
