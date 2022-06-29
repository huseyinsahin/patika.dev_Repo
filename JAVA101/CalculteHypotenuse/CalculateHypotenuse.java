import java.util.Scanner;

public class CalculateHypotenuse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double firstEdge, secondEdge, hypotenuse, uValue, area, perimeter;

        System.out.print("Please enter the first edge of the triangle : ");
        firstEdge = input.nextDouble();

        System.out.print("Please enter the second edge of the triangle : ");
        secondEdge = input.nextDouble();

        hypotenuse = Math.sqrt((firstEdge * firstEdge) + (secondEdge * secondEdge));

        uValue = (firstEdge + secondEdge + hypotenuse);
        
        perimeter = 2 * uValue;

        area = Math.sqrt(uValue * (uValue - firstEdge) * (uValue - secondEdge) * (uValue - hypotenuse));

        System.out.println("First Edge : " + firstEdge);
        System.out.println("Second Edge :" + secondEdge);
        System.out.println("Hypotenuse : " + hypotenuse);
        System.out.println("Perimeter : " + perimeter);
        System.out.println("Area : " + area);


        input.close(); 
    }
}
