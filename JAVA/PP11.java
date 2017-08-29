import java.util.Scanner;

public class PP11 {
    public static void main(String [] ag)
    {
        Scanner S=new Scanner(System.in);
        long a=S.nextLong();
        long b=S.nextLong();
        long p=1;
        for (int i=0;i<b;i++)
            p*=a;
        System.out.println(p);
    }
}
