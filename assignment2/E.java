import java.util.Arrays;
import java.util.Scanner;
public class E {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int i,j;
        String s,ans;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            s=sc.next();
            ans="";
            for(j=6;j>=0;j-=2)
            {
                ans+=s.charAt(j);ans+=s.charAt(j+1);
            }
            System.out.printf("%s ",ans);
        }
    }
}
