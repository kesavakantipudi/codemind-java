import java.util.Scanner;
public class circle
{
    public static void main(String [] args)
    {
        Scanner read = new Scanner(System.in);
        double radius = read.nextDouble();
        double area = 3.14*radius*radius;
        double perimeter = 2*3.14*radius;
        System.out.printf("%.2f
",area);
        System.out.printf("%.2f",perimeter);
    }
}