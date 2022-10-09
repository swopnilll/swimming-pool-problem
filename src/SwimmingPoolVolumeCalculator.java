import java.util.Scanner;

public class SwimmingPoolVolumeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the width");
        double width = sc.nextDouble();

        System.out.println("Please enter the length");
        double length = sc.nextDouble();

        //Instantiating a rectangle object
        Rectangle rectangleObject = new Rectangle(width, length);

        System.out.println("rectangle.width = " +rectangleObject.getWidth());
        System.out.println("rectangle.length = " +rectangleObject.getLength());
        System.out.println("rectangle.area = " +rectangleObject.getArea());

        System.out.println("Please enter the width for Cuboid");
        double widthForCubiod = sc.nextDouble();

        System.out.println("Please enter the length for Cuboid");
        double lengthForCubiod = sc.nextDouble();

        System.out.println("Please enter the height for Cuboid");
        double heightForCubiod = sc.nextDouble();

        //Instantiating a cuboid object
        Cuboid cuboidObject = new Cuboid(widthForCubiod, lengthForCubiod, heightForCubiod);

        System.out.println("cuboid.width = " +cuboidObject.getWidth());
        System.out.println("cuboid.length = " +cuboidObject.getLength());
        System.out.println("cuboid.area = " +cuboidObject.getArea());
        System.out.println("cuboid.volume = " +cuboidObject.getVolume());


    }
}
