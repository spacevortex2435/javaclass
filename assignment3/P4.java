import java.util.Scanner;
class Met
{
    public static int tot;
    public static void Solve(int xl,int xr,int yl,int yr)
    {
        int i;
        if(xl>xr||yl>yr) return ;
        if(xl==xr)
        {
            for(i=yl;i<=yr;i++) P4.t[xl][i]=P4.pl[++tot];
            return ;
        }
        if(yl==yr)
        {
            for(i=xl;i<=xr;i++) P4.t[i][yl]=P4.pl[++tot];
            return ;
        }
        for(i=xl;i<=xr;i++) P4.t[i][yl]=P4.pl[++tot];
        for(i=yl+1;i<yr;i++) P4.t[xr][i]=P4.pl[++tot];
        for(i=xr;i>=xl;i--) P4.t[i][yr]=P4.pl[++tot];
        for(i=yr-1;i>yl;i--) P4.t[xl][i]=P4.pl[++tot];
        Met.Solve(xl+1,xr-1,yl+1,yr-1);
    }
}
public class P4
{
    static int N=105;
    public static int[][] t=new int[N][N];
    public static int[] pl=new int[N*N];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m;
        int i,j;
        n=sc.nextInt();m=sc.nextInt();
        for(i=1;i<=n*m;i++) pl[i]=sc.nextInt();
        Met.Solve(1,n,1,m);
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=m;j++) System.out.printf("%d ",t[i][j]);
            System.out.println();
        }
    }
}
