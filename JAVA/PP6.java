import java.util.Scanner;

public class PP6 {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        String s=S.next();
        char[] c = s.toCharArray();
        int i=0;
        for (char x : c)
            i++;
        System.out.println(i);
    }
}