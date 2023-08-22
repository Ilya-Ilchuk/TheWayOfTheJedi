public class Triangle extends Figure implements Size{
    public Triangle(String _color, float _width, float _height, byte[] _coordinates) {
        setValues(_color, _width, _height, _coordinates);
        System.out.println(getValues());
    }

    @Override
    public void rotate() {
        System.out.println("Triangle is rotated\n");
    }

    @Override
    public void setSize() {
    }

    @Override
    public void getSize() {

    }

    @Override
    public void changeSize() {

    }

    @Override
    public void deleteSize() {

    }
}
