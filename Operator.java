import java.util.Scanner;
public class Operator{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter first number");
        int one =scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter second number");
        int two =scanner.nextInt();
        scanner.nextLine();
        int add=one+two;
        System.out.println("Answer is "+ add); 
        int sub=one-two;
        System.out.println("Answer is "+ sub);
        int mul=one*two;
        System.out.println("Answer is "+ mul);
        int div=one/two;
        System.out.println("Answer is "+ div);
        int mod=one%two;
        System.out.println("Answer is "+ mod);
    }
}