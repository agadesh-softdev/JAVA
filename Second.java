
import java.util.Scanner;


public class Second{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter yr name");
        String name =scanner.nextLine();

        System.out.println("Enter your age");
        int age=scanner.nextInt();

        System.out.println("Enter your email");
        String email=scanner.nextLine();

        System.out.println("Enter your email");
        String second=scanner.nextLine();



        System.out.println("Your name is "+ name);
        System.out.println("Your age is "+ age);
        System.out.println("Your email is "+ email);
        System.out.println("Your email is "+ second);


    }
}