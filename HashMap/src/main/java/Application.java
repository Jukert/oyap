public class Application {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("123", "234");
        map.put("123", "23");
        map.put("123", "24");
        map.put("123", "2434");
        map.put("123", "2364");
        map.put("123", "2346");
        map.put("123", "2347");

        System.out.println(map.get("123"));
    }

}
