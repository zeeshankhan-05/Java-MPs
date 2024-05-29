import java.util.Scanner;

public class ImpendingDeadline {

    public static void main(String[] args) {

        Scanner old = new Scanner(System.in);

        System.out.print("What is your birth month? ");
        int MM = old.nextInt();        

        System.out.print("What is your birth day? ");
        int D = old.nextInt();  

        System.out.print("What is your birth year? ");
        int YYYY = old.nextInt();  

        int N = -1 * (((MM / 3) + 3) / 4 - 1);
        int y = YYYY - N;

        int X = (12 * N) + 1; // 1 (Mar - Dec) or 13 (Jan, Feb)
        int m = MM + X;

        int A = (y / 100);
        int B = 2 - A + (int) (A / 4);

        int JD = (int) (365.25 * y) + (int) (30.6001 * m) + B + D + 1720995;

        int DJD = 2460202;

        System.out.println("You will be " + (DJD - JD) + " days old when this assignment is due! Dang, you old");
    }
}
