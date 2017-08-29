import java.util.Scanner;

public class PP9 {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int  n=S.nextInt();
        int[] i=new int[n];
        for (int x=0;x<n;x++)
            i[x]=S.nextInt();
        int s=S.nextInt();
        for (int x=0;x<n;x++){
            if (i[x]==s)
            {
                System.out.println(s+" found at index "+x);
                break;
            }
            else
            {
                if(x==(i.length-1))
                    System.out.println(s + " not found");
            }
        }
    }
}
