import java.lang.Math;
import java.util.Scanner;
public class PP16 {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        System.out.println(sumOfDig(n));
    }
    private static int sumOfDig(long n)
    {
        int sum=0;
        long i;
        while(n>0)
        {
            i=n%10;
            sum+=i;
            n=n/10;
        }
        return sum;
    }
}