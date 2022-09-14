import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        int a;
        String year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        a = sc.nextInt();
        year = (((a % 4 == 0) && (a % 100 != 0)) || a % 400 == 0) ? "Leap Year" : "Not leap year";
        System.out.println(year);
    }
}