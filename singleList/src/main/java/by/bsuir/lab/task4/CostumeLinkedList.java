package by.bsuir.lab.task4;

class CostumeLinkedList<T> {
    static class Node<T> {
        Node next;
        Node prev;
        T data;
        public Node(T data,Node<T> next, Node<T> prev) {
            this.next = next;
            this.prev = prev;
            this.data = data;
        }
    }

    Node<T> head;

     void addToList(T value) {
        Node<T> newNode = new Node<>(value,null,null);
        if (head==null)
           head = newNode;
        else{
            Node<T> temp = head;
            while (temp.next!=null) {
                temp = temp.next;
            }
            newNode.prev = temp;
            temp.next=newNode;
        }
    }

    T get(int i){
        Node temp = this.head;
        while (temp.next!=null) {
            temp = temp.next;
        }
        int j = size();
        while (temp.prev != null) {
            if (i == j) {
                return (T) temp.data;
            }
            j--;
            temp = temp.prev;
        }

        if (i == j) {
            return (T) temp.data;
        }
        return null;

    }
    int size(){
        int i = 0;

        Node temp = head;
        if (temp == null) {
            return 0;
        }

        while (temp.next != null) {
            i++;
            temp = temp.next;
        }

        return i + 1;
    }
    public String print() {

        StringBuilder sb = new StringBuilder("[");
        Node<T> temp = head;
        if (head == null) {
            return null;
        }
        while (temp.next != null) {
            sb.append(temp.data.toString());
            temp = temp.next;
            sb.append(", ");
        }
        sb.append(temp.data);
        sb.append("]");
        return sb.toString();
    }
}
