import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.next();
        System.out.println("Hello " + name);


        System.out.println("Your name is what? ");
        System.out.println("My name is " + name);

    }
}