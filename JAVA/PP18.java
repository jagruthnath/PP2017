import java.util.Scanner;

public class PP18 {
    public static void main(String[] a)
    {
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        System.out.println(fact(n));
    }
    private static int fact(int n)
    {
        if (n==0 || n==1)
            return 1;
        else
            return n*fact(n-1);
    }
}
