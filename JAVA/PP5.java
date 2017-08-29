import java.util.Scanner;

public class PP5 {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int a=S.nextInt();
        int b=S.nextInt();
        System.out.println("A = "+a+"\tB = "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("A = "+a+"\tB = "+b);
    }
}
