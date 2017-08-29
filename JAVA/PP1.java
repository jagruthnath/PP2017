import java.util.Scanner;

public class PP1 {

    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        if ( n%2 == 0 )
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
