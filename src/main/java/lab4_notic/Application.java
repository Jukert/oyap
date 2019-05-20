package lab4_notic;


public class Application {

    public static void main(String[] args) {
        System.out.println(InfixToPostfix.infixToPostfix("(d-c)/b+a"));

        System.out.println(InfixToPrefix.infixToPrefix("a+b/(c-d)"));
    }

}
