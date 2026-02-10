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

        System.out.println("Volume: " + blackbox.vol());
    }
}