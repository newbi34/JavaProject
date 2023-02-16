
public abstract class Shapes {
    
    public abstract int area();

    public abstract int circumference();

    public  String toString() {
        return String.format("%s , %s ", this.versionOfShape(), this.information());
    }

    public abstract String versionOfShape();

    public abstract String information();

    public  String volume() {
        return String.format("2D shapes dont have volume");
    }
    
}