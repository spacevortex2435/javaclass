import java.util.Scanner;
public class P2 {
    static int N=135;
    static int[][] h=new int[N][N];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int B=5;
        int i,j,ans=0;
        n=sc.nextInt();
        for(i=B;i<B+n;i++)
        {
            for(j=B;j<B+n;j++) h[i][j]=sc.nextInt();
        }
        for(i=1;i<B+B+n;i++)
        {
            for(j=1;j<B+B+n;j++)
            {
                if((h[i][j]^h[i][j-1])>0) ans++;
                if((h[i][j]^h[i][j+1])>0) ans++;
                if((h[i][j]^h[i-1][j])>0) ans++;
                if((h[i][j]^h[i+1][j])>0) ans++;
            }
        }
        ans>>=1;
        System.out.println(ans);

    }
}
