package by.bsuir.lab.task4;

import by.bsuir.lab.common.User;
import by.bsuir.lab.list.LinkedList;

public class Application {
    public static void main(String[] args) {
        CostumeLinkedList<User> costumeLinkedList = new CostumeLinkedList<>();
        LinkedList<User> list = new LinkedList<>();
        costumeLinkedList.addToList(new User("Exmalple1", "1111111"));
        costumeLinkedList.addToList(new User("Exmalple2", "2222222"));
        costumeLinkedList.addToList(new User("Exmalple3", "3333333"));
        costumeLinkedList.addToList(new User("Exmalple4", "4444444"));
        costumeLinkedList.addToList(new User("Emergency", "102"));
        for (int i = costumeLinkedList.size(); i > 0; i--) {
            if (costumeLinkedList.get(i).getPhone().length() > 3)
                list.add(costumeLinkedList.get(i));
        }
        System.out.println(list.print());
        System.out.println(costumeLinkedList.print());
    }
}
