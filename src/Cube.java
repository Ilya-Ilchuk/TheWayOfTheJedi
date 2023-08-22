import java.util.Arrays;

public class Cube {
    // fields
    private String color = "black";
    private float width = 2.0f;
    private float height = 2.0f;
    private byte[] coordinates = new byte[]{0, 0, 0};

    // constructor
    public Cube() {
        System.out.println(getValues());
    }
    // constructor

    public Cube(String _color) {
        color = _color;
        System.out.println(getValues());
    }

    // constructor
    public Cube(String color, float width, float height) {
        this.color = color;
        this.width = width;
        this.height = height;
        System.out.println(getValues());
    }

    // method
    public void setValues(String _color, float _width, float _height, byte[] _coordinates) {
        color = _color;
        width = _width;
        height = _height;
        coordinates = _coordinates;
    }

    // method
    public String getValues() {
        String info = "Cube properties\ncolor: " + color + "\nwidth: " + width + "\nheight: " + height + "\n";

        if (coordinates.length > 0) {
            String infoCoordinates = "Coordinates\n";
            for (byte el : coordinates) {
                infoCoordinates += el + "\n";
            }
            return info + infoCoordinates;
        }
        return info;
    }
}
