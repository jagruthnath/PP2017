import java.util.Scanner;

public class PP2 {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        int i=n/10;
        int j=n%10;
        if (i==7)
        {
            if (j >= 5)
                System.out.println("B");
	        else
                System.out.println("C");
        }
        else
        {
            if (i == 8)
            {
                if (j >= 5)
                    System.out.println("A");
                else
                    System.out.println("B+");
            }
            else if (i == 9)
            {
                if (j >= 5)
                    System.out.println("EX");
                else
                    System.out.println("A+");
            }
            else
                System.out.println("F");
        }
    }
}
