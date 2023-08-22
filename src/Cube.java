public class Cube  extends Figure{
    public Cube(String color, float width, float height, byte[] coordinates) {
        super(color, width, height, coordinates);
        System.out.println(getValues());
    }
}
