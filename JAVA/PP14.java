import java.util.Scanner;

public class PP14 {
    public static void main(String [] ag)
    {
        Scanner S=new Scanner(System.in);
        String st=S.next();
        char[] a=new char[st.length()];
        char[] r=st.toCharArray();
        int n=st.length()-1;
        for (char ch:r)
            a[n--]=ch;
        System.out.print(a);
    }
}
