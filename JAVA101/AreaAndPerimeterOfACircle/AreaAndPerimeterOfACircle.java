import java.util.Scanner;

public class AreaAndPerimeterOfACircle {
    public static void main(String[] args) {

        double radius, area, perimeter, circleSliceAngle, circleSliceArea;
        double pi = 3.14;
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the radius : ");
        radius = sc.nextDouble();

        System.out.print("Please enter the circle slice angle : ");
        circleSliceAngle = sc.nextDouble();

        area = pi * radius * radius;
        perimeter = 2 * pi * radius;

        circleSliceArea = (pi * (radius * radius) * circleSliceAngle) / 360;

        System.out.println("Radius of the circle : " + radius);
        System.out.println("Angle of circle slice : " + circleSliceAngle);
        System.out.println("Perimeter of the circle : " + perimeter);
        System.out.println("Area of the circle : " + area);
        System.out.println("Area of circle slice : " + circleSliceArea);

        sc.close();
    }
}
