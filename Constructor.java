class Box {
    int l, b, h;

    // Parameterized constructor
    Box(int length, int breadth, int height) {
        l = length;
        b = breadth;
        h = height;
    }

    int vol() {
        return l * b * h;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Box blackBox = new Box(10,20,30);
        System.out.println(blackBox.vol()); 

        Box whiteBox = new Box(10, 20, 30);
        System.out.println(whiteBox.vol()); 
    }
}