import java.util.Arrays;
import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        int n;
        int i,x,pd=0;
        int[] a=new int [105];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            x=sc.nextInt();a[x]=1;
        }
        for(i=1;i<=n;i++) if(a[i]==0) {pd=1;System.out.printf("%d ",i);}
        if(pd==0) System.out.println("NULL");
    }
}
