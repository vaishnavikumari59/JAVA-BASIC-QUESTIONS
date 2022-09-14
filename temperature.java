import java.util.Scanner;

public class temperature {
    public static void main(String[] args){
        double f,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value in fahrenheit");
        f=sc.nextDouble();
        c=((f-32)*5)/9;
        System.out.println("Temperature in celsius is :"+c);
    }
}
