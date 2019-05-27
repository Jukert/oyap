package lab6;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Application {
    public static void main(String[] args) {

        Queue<String> queue = new ConcurrentLinkedQueue<>();
        queue.add("qwe");
        queue.add("qwe1");
        queue.add("qwe2");
        queue.add("qwe3");
        queue.add("qwe4");

        Scanner sc = new Scanner(System.in);
        String v = sc.next();

        for (String s : queue) {
            if (s.equals(v)) {
                queue.remove(s);
                continue;
            }
            System.out.println(s);
        }
    }
}
