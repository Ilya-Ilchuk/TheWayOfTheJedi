public class Cube  extends Figure{
    private Boolean visible;
    public Cube(String color, float width, float height, byte[] coordinates, boolean _visible) {
        super(color, width, height, coordinates);
        visible = _visible;
    }

    public void setValues(String color, float width, float height, byte[] coordinates, boolean visible) {
        super.color = color;
        super.width = width;
        super.height = height;
        super.coordinates = coordinates;
        this.visible = visible;
    }

    @Override
    public String getValues() {
        String info = super.getValues();
        return info + "\n" + checkVisible();
    }

    @Override
    public void rotate() {
        System.out.println("Cube is rotated");
    }

    public String checkVisible() {
        if (visible) {
            return  "The Cube is visible\n";
        } else {
            return  "The Cube is NOT visible\n";
        }
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

}
