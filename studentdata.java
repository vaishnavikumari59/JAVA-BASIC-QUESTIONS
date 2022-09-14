import java.util.Scanner;

public class studentdata {
    public static void main(String[] args){
        String name,sec,course;
        long roll;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        name=sc.nextLine();
        System.out.println("Enter section");
        sec=sc.nextLine();
        System.out.println("Enter course");
        course=sc.nextLine();
        System.out.println("Enter roll");
        roll=sc.nextLong();
        System.out.println("Student Data");
        System.out.println(name);
        System.out.println(sec);
        System.out.println(course);
        System.out.println(roll);
    }
}
