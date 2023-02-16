public class Rectangular extends Shapes {
    
    private int length;
    private int height;

    public Rectangular(int length, int height) {
        this.length = length;
        this.height = height;
    }
    @Override
    public int area() {
        return(length * height );
    }
    @Override
    public int circumference() {
        return (2 * length + 2 * height);
    }
    @Override
    public String versionOfShape() {
        return String.format("Rectangular");
    }
    @Override
    public String information() {
        return String.format("length = %d , heigth = %d", length, height);
    }
}
