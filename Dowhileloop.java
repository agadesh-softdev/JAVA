public class Dowhileloop {
    public static void main(String[] args) {
        int n=10;
        int i=1;
        int store=1;
        do{
            store=store*n;
            n--;
        }while(n>=i);
        System.out.println(store);
    }
}
