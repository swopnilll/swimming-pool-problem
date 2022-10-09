public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double width, double length, double height){
        super(width, length);
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public double getVolume(){
        double volume = getArea() * this.height;

        return volume;
    }



}
