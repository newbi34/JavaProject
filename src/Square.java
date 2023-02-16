public class Square extends Rectangular {

    private int side;
    
    public Square(int side) {
        super(side, side);
    }

    @Override
    public String versionOfShape() {
        return String.format("Square");
    }

    @Override
    public String information() {
        return String.format("side = %d", side);
    }
}
