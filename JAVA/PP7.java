import java.util.Scanner;

public class PP7 {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int  n=S.nextInt();
        int sum=0;
        int[] i=new int[n];
        for (int x=0;x<n;x++){
            i[x]=S.nextInt();
            sum+=i[x];
        }
        System.out.println("Mean : "+sum/n);
    }
}
