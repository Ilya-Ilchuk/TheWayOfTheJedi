import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dragon Ravi");

        Cube cube = new Cube();

//        cube.color = "red";
//        cube.width = 2;
//        cube.height = 2;
//        cube.coordinates = new byte[] {50,50,0};
        System.out.println(cube.color);

        cube.setValues("black", 2.0f, 2.0f, new byte[] {50,50,0});

        System.out.println(cube.getValues());
    }
}