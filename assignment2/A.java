import java.util.Arrays;
import java.util.Scanner;
public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T,n,m,i,j;
        int[] a=new int[105],b=new int[105];
        T=sc.nextInt();
        while((T--)>0)
        {
            n=sc.nextInt();m=sc.nextInt();
            Arrays.fill(a,0); Arrays.fill(b,0);
            for(i=1;i<=n;i++) a[n-i+1]=sc.nextInt();
            for(i=1;i<=m;i++) b[m-i+1]=sc.nextInt();
            n=Math.max(n,m)+1;
            for(i=1;i<=n;i++) a[i]+=b[i];
            for(i=1;i<=n;i++) {
                if (a[i] >= 10) {
                    a[i] -= 10;a[i + 1]++;
                }
            }
            while(n>1&&a[n]==0) n--;
            for(i=n;i>=1;i--) System.out.printf("%d",a[i]);
            System.out.printf("\n");
        }
    }
}
