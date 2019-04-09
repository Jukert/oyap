package by.bsuir.lab;


import by.bsuir.lab.common.*;
import by.bsuir.lab.list.LinkedList;
import by.bsuir.lab.parser.PolynomialParser;
import by.bsuir.lab.tasks.Counter;
import by.bsuir.lab.tasks.SumMonomial;

public class Application {
    public static void main(String[] args) {
        PolynomialParser m = new PolynomialParser();

        LinkedList<Monomial> first = m.parse("x");
        LinkedList<Monomial> second = m.parse("x");

        LinkedList<Monomial> third = first.summ(second);
        System.out.println(third.print());

        SumMonomial sumMonomial = new SumMonomial();
        System.out.println(sumMonomial.formatter(third));

        System.out.println("------------------------------------------------------------------------");

        Counter counter = new Counter();
        LinkedList<Player> linkedList = new LinkedList<>();

        linkedList.add(new Player(1));
        linkedList.add(new Player(2));
        linkedList.add(new Player(3));
        linkedList.add(new Player(4));
        linkedList.add(new Player(5));
        linkedList.add(new Player(6));
        linkedList.add(new Player(7));
        linkedList.add(new Player(8));
        linkedList.add(new Player(9));
        linkedList.add(new Player(10));
        linkedList.add(new Player(11));
        linkedList.add(new Player(12));

        counter.play(linkedList);


        System.out.println("-----------------------------------------------------------------------------");

        LinkedList<User> userList = new LinkedList<>();
        userList.add(new User("Name", "123"));
        userList.add(new User("Artem", "2356"));
        userList.add(new User("Sveta", "7865"));
        userList.add(new User("bory", "5555555"));

        userList.sort(new UserComparatorByName());
        System.out.println(userList.print());

        userList.sort(new UserComparatorByPhone());
        System.out.println(userList.print());
    }
}
