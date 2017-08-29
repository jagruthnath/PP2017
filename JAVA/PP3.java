import java.util.Scanner;

public class PP3 {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int x=S.nextInt();
        if (x%4==0)
            if (x%100==0)
                if (x%400==0)
                    System.out.println("Leap year");
                else
                    System.out.println("Not a leap year");
            else
                System.out.println("Leap year");
        else
            System.out.println("Not a leap year");
    }
}
