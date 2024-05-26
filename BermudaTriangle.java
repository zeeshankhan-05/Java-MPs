import java.util.Scanner;

public class BermudaTriangle {

    public static void main(String[] args) {

        Scanner coordinates = new Scanner(System.in);

        // --- Coordinates ---

        System.out.print("X1: ");
        int X1 = coordinates.nextInt();

        System.out.print("Y1: ");
        int Y1 = coordinates.nextInt();

        System.out.print("X2: ");
        int X2 = coordinates.nextInt();

        System.out.print("Y2: ");
        int Y2 = coordinates.nextInt();

        System.out.print("X3: ");
        int X3 = coordinates.nextInt();

        System.out.print("Y3: ");
        int Y3 = coordinates.nextInt();

        // ------ Triangle Facts ------

        System.out.println("Triangle Facts:");

        // --- Sides ---

        double side1x = (X2 - X1);
        double side1y = (Y2 - Y1);
        side1x = Math.pow(side1x, 2);
        side1y = Math.pow(side1y, 2);
        double side1 = Math.sqrt(side1x + side1y);

        double side2x = (X3 - X2);
        double side2y = (Y3 - Y2);
        side2x = Math.pow(side2x, 2);
        side2y = Math.pow(side2y, 2);
        double side2 = Math.sqrt(side2x + side2y);

        double side3x = (X3 - X1);
        double side3y = (Y3 - Y1);
        side3x = Math.pow(side3x, 2);
        side3y = Math.pow(side3y, 2);
        double side3 = Math.sqrt(side3x + side3y);

        System.out.println("Length of Sides - " + side1 + ", " + side3 + ", " + side2);

        // --- Midpoints ---

        double mid1x = (X1 + X2) / 2.0;
        double mid1y = (Y1 + Y2) / 2.0;

        double mid3x = (X3 + X1) / 2.0;
        double mid3y = (Y3 + Y1) / 2.0;

        double mid2x = (X3 + X2) / 2.0;
        double mid2y = (Y3 + Y2) / 2.0;

        System.out.println("Midpoints of Sides - " + "(" + mid1x + ", " + mid1y + ")" + ", " + "(" + mid3x + ", "
                + mid3y + ")" + ", " + "(" + mid2x + ", " + mid2y + ")");

        // --- Perimeter ---

        double perimeter = (side1 + side2 + side3);
        System.out.println("Perimeter of the Triangle - " + perimeter);
        

        // --- Area ---
        
        double s = perimeter / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println("Area of the Triangle - " + area);

        // --- Centroid ---

        double centroidx = ((X1 + X2 + X3) / 3);
        double centroidy = ((Y1 + Y2 + Y3) / 3);
        System.out.println("Coordinates of the Centroid - " + "(" + centroidx + ", " + centroidy + ")" );

        // --- Slope ---

        int slope1y = (Y2 - Y1);
        int slope1x = (X2 - X1);

        int slope3y = (Y3 - Y1);
        int slope3x = (X3 - X1);

        int slope2y = (Y3 - Y2);
        int slope2x = (X3 - X2);

        System.out.println("Slope of the Sides - " + slope1y + "/" + slope1x + ", " + slope3y + "/" + slope3x + ", " + slope2y + "/" + slope2x);

        // --- Equations ---

        System.out.println("Equation of the Sides - " + "(y - " + Y1 + ")" + " = " + slope1y + "/" + slope1x + "(x - " + X1 + ")" + 
                            ", " + "(y - " + Y3 + ")" + " = " + slope3y + "/" + slope3x + "(x - " + X3 + ")" + ", " + "(y - " + Y2 + ")" + " = " + slope2y + "/" + slope2x + "(x - " + X2 + ")");

        coordinates.close();
    }
}
