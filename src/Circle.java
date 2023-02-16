import java.lang.Math;

public class Circle extends Shapes {
    
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int area() {
        return (radius * radius * (int) Math.PI );
    }

    public int circumference() {
        return (2 * radius * (int) Math.PI);
    }

    public String versionOfShape() {
        return String.format("Circle");
    }

    public String information() {
        return String.format("radius = %d", radius);
    }
}
