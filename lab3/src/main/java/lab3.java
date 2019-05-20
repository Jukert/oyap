import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class lab3 {

    public static void main(String[] args) {

        System.out.println("Введите предложение разделенное пробелами: ");

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '_') {
                continue;
            }
            if (map.get(ch) != null) {
                map.replace(ch, map.get(ch) + 1);
                continue;
            }
            map.put(ch, 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.print(String.valueOf(entry.getKey()) + entry.getValue());
        }
    }
}
