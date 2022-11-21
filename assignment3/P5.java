import java.util.Scanner;
public class P5 {
    static int N=505;
    static int[][] t=new int[N][N];
    static int n;
    public static boolean chk()
    {
        int i,j,k,pd;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                pd=1;
                for(k=0;k<5&&pd>0;k++)
                {
                    if(t[i][j+k]==0) pd=0;
                }
                if(pd>0) return true;

                pd=1;
                for(k=0;k<5&&pd>0;k++)
                {
                    if(t[i+k][j]==0) pd=0;
                }
                if(pd>0) return true;

                pd=1;
                for(k=0;k<5&&pd>0;k++)
                {
                    if(t[i+k][j+k]==0) pd=0;
                }
                if(pd>0) return true;

                if(i>=5)
                {
                    pd=1;
                    for(k=0;k<5&&pd>0;k++)
                    {
                        if(t[i-k][j+k]==0) pd=0;
                    }
                    if(pd>0) return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int i,j,pd=0;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                t[i][j]=sc.nextInt();

            }
        }
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(t[i][j]>0) continue;
                t[i][j]=1;
                if(chk())
                {
                    pd=1;
                    System.out.printf("%d %d\n",i,j);
                }
                t[i][j]=0;
            }
        }
        if(pd==0) System.out.println("-1");
    }
}
