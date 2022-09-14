import java.util.Scanner;

public class oddeven {
    public static void main(String[] args){
        int a;
        String b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        a= sc.nextInt();
        b=(a%2==0)?"even":"odd";
        System.out.println(b);
    }
}
