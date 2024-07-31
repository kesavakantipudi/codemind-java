import java.util.Scanner;
public class SumOfNNum
{
    public static void main(String [] args)
    {
        Scanner read = new Scanner(System.in);
        int number,sum=0;
        number = read.nextInt();
        for(int i=1;i<=number;i++)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
}