import java.util.Scanner;

public class PP19 {
    public static void main(String[] ar)
    {
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++)
            a[i]=S.nextInt();
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
                if(a[i]>a[j])
                {
                    a[i]=a[i]+a[j];
                    a[j]=a[i]-a[j];
                    a[i]=a[i]-a[j];
                }
        if (n%2!=0)
            System.out.println(a[n/2]);
        else
            System.out.println((a[n/2]+a[(n/2)-1])/2);
    }
}
