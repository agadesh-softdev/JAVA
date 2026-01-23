
import java.util.Scanner;


public class Conditionalstatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your mark : ");
        int mark=scan.nextInt();
        if(mark>=90){
            System.out.println("Your mark is "+mark +" A Grade");
        }
        else if(mark>=80){
            System.out.println("Your mark is "+mark +" B Grade");
        }
        else if(mark>=70){
            System.out.println("Your mark is "+mark +" C Grade");
        }
        else if(mark>=60){
            System.out.println("Your mark is "+mark +" D Grade");
        }
        else{
            System.out.println("Your mark is "+mark +" E Grade");
        }
    }
}
