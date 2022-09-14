import java.util.Scanner;

public class greatest {
    public static void main(String[] args){
        double a,b,largest;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a");
        a= sc.nextDouble();
        System.out.println("Enter value of b");
        b=sc.nextDouble();
        largest=a>b?a:b;
        System.out.println("The largest no. is : "+largest);



    }
}
