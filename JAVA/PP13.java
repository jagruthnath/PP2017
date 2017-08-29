import java.util.Scanner;

public class PP13 {
    public static void main(String [] ag)
    {
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        for (int i=2;i<=n;i+=2)
            System.out.print(i+"\t");
    }
}
