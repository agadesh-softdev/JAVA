class Box {
    int l, b, h;

    int vol() {
        return l * b * h;
    }
}

public class ClassObject {
    public static void main(String[] args) {
        System.out.println("---------");
        Box blackbox = new Box();
        blackbox.l = 10;
        blackbox.b = 20;
        blackbox.h = 30;

        Box whitebox=new Box();
        whitebox.l=20;
        whitebox.b=20;
        whitebox.h=20;
        System.out.println(whitebox.vol());


        System.out.println("Volume: " + blackbox.vol());
    }
}