import java.util.Scanner;

public class Relationalop{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a ");
        int a=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter b ");
        int b=scanner.nextInt();
        scanner.nextLine();
        boolean c=(a==b);
        System.out.println("the Number are "+c);
    }
}
