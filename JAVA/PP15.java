import java.util.Scanner;

import java.lang.Math;

public class PP15 {
    public static void main(String [] ag)
    {
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        int flag=0;
        if (n==1)
            System.out.println(n+" is neither prime nor composite.");
        else if (n<1)
            System.out.println(n+" is negative.");
        else {
            if (n!=2)
                for (int i=2;i<Math.sqrt(n)+1;i++) {
                    if (n % i == 0)
                        flag = 1;
                    else
                        i++;
                }
            if (flag==0)
                System.out.println(n+" is prime.");
            else
                System.out.println(n+" is not prime.");
        }
    }
}
