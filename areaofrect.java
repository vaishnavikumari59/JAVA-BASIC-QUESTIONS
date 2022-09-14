import java.util.Scanner;
public class areaofrect {
    public static void main(String[]args){
        int l,b,area=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length");
        l=sc.nextInt();
        System.out.println("Enter breadth");
        b=sc.nextInt();
        area=l*b;
        System.out.println("Area of rectangle is");
        System.out.println(area);


    }
}
