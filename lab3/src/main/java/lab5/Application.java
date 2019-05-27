package lab5;

public class Application {

    public static void main(String[] args) {

        String f1 = "D:\\workspaces\\test\\yap\\lab3\\src\\main\\resources\\F1.txt";
        String f2 = "D:\\workspaces\\test\\yap\\lab3\\src\\main\\resources\\F2.txt";

        FileReader file1 = new FileReader(f1);
        String inf1 = file1.read();

        FileReader file2 = new FileReader(f2);
        String inf2 = file2.read();

        FileWriter fw1 = new FileWriter(f2);
        fw1.write(inf1);

        FileWriter fw2 = new FileWriter(f1);
        fw2.write(inf2);
    }
}
