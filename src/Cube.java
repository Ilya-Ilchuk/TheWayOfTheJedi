import java.util.Arrays;

public class Cube {
    public String color = "pink";
    public float width;
    public float height;
    public byte[] coordinates;

    public void setValues(String _color, float _width, float _height, byte[] _coordinates) {
        color = _color;
        width = _width;
        height = _height;
        coordinates = _coordinates;
    }

    public String getValues() {
        return "Cube properties\ncolor: " + color + "\nwidth: " + width + "\nheight: " + height + "\ncoordinates: " + Arrays.toString(coordinates);
    }

}
