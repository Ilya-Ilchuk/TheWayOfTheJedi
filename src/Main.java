import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dragon Ravi\n");

        Cube cube = new Cube("pink",10,10, new byte[] {0,2,0}, false);
        System.out.println(cube.getValues());

        Rectangle rectangle = new Rectangle("red",11,10, new byte[] {1,2,0});
        rectangle.rotate();
    }
}