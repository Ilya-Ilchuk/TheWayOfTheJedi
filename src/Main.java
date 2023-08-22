public class Main {
    public static void main(String[] args) {
        System.out.println("Dragon Ravi\n");

        Cube cube = new Cube("pink",10,10, new byte[] {0,2,0}, false);
        System.out.println(cube.getValues());
        cube.animation.setSpeed(10);

        Rectangle rectangle = new Rectangle("red",11,10, new byte[] {1,2,0});
        rectangle.rotate();
        rectangle.animation.setSpeed(10);

        Triangle triangle = new Triangle("sky",4,4, new byte[] {1,1,1}) {
            @Override
            public String getValues() {
                return super.getValues() + "\n" + "Triangle was created";
            }
        };
        triangle.animation.setSpeed(11);
    }
}