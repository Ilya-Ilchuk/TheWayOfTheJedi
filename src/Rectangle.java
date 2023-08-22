public class Rectangle extends Figure{
    public Rectangle(String _color, float _width, float _height, byte[] _coordinates) {
        setValues(_color, _width, _height, _coordinates);
        System.out.println(getValues());
    }

    @Override
    public void rotate() {
        System.out.println("Rectangle is rotated");
    }
}
