import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
         a=sc.nextInt();
         b=sc.nextInt();
        System.out.print("The Swap of number"+a+ " "+b);
         a=a+b;
         b=a-b;
         a=a-b;
         System.out.println(" is "+a+" "+b);

    }
}
