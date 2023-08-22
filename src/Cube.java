public class Cube  extends Figure{
    private Boolean visible;
    public Cube(String color, float width, float height, byte[] coordinates, boolean _visible) {
        super(color, width, height, coordinates);
        visible = _visible;
        System.out.println(getValues());
    }

    public void checkVisible() {
        if (visible) {
            System.out.println("The Cube is visible\n");
        } else {
            System.out.println("The Cube is NOT visible\n");
        }
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

}
