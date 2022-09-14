import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args) {
        double r, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        r = sc.nextDouble();
        area = 3.14 * (r * r);
        System.out.println("Area of circle is");
        System.out.println(area);

    }
}