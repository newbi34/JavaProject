public class Cube extends Shapes {

    private int side;
    private int volume;

    public Cube(int side) {
        this.side = side;
        volume = side * side * side;
    }
    
    @Override
    public int area() {
        return (6 * side * side);
    }

    @Override
    public int circumference() {
        return (12 * side);
    }

    @Override
    public String versionOfShape() {
        return String.format("Cube");
    }

    @Override
    public String information() {
        return String.format("side = %d", side);
    }

    @Override
    public String volume() {
        return String.format("volume = %d", volume);
    }
}
