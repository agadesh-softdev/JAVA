import java.util.Scanner;
public class Switch2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char letter;
        System.out.println( "Enter a Letter : ");
        letter=scan.next().charAt(0);

        switch(letter){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("You Entered a vowel");
                break;
            default:
                System.out.println("It's not a vowel");
        }

    }
}
