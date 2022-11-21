import java.util.Scanner;
class Mat
{
    static int N=105;
    int [][] t=new int[N][N];
    public void setV(int x,int y,int w)
    {
        t[x][y]=w;
    }
    public static Mat add(Mat a,Mat b)
    {
        int n=P1.n;
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                //System.out.printf("%d %d   %d %d\n",i,j,a.t[i][j],b.t[i][j]);
                a.t[i][j]+=b.t[i][j];
            }
        }
        return a;
    }
    public static Mat sub(Mat a,Mat b)
    {
        int n=P1.n;
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++) a.t[i][j]-=b.t[i][j];
        }
        return a;
    }
    public static Mat mul(Mat a,Mat b)
    {
        int n=P1.n;
        int i,j,k;
        Mat c=new Mat();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                for(k=1;k<=n;k++)
                {
                    c.t[i][j]+=a.t[i][k]*b.t[k][j];
                }
            }
        }
        return c;
    }
    public static Mat trans(Mat a)
    {
        int n=P1.n;
        int i,j,tmp;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                tmp=a.t[i][j];a.t[i][j]=a.t[j][i];a.t[j][i]=tmp;
            }
        }
        return a;
    }
}
public class P1 {
    public static int n;
    static int N=105;
    static int [][] a=new int[N][N],b=new int[N][N],c=new int[N][N];
    static public Mat gMat(int x,int y,int[][] a)
    {
        Mat mt=new Mat();
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                //System.out.printf("gMat %d %d    %d\n",i,j,a[x]);
                mt.t[i+1][j+1]=a[x+i][y+j];
            }
        }
        return mt;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m;
        int i,j;
        Mat u1,u2,u3;
        m=sc.nextInt();
        n=m>>1;
        for(i=1;i<=m;i++)
        {
            for(j=1;j<=m;j++) a[i][j]=sc.nextInt();
        }
        for(i=1;i<=m;i++)
        {
            for(j=1;j<=m;j++) b[i][j]=sc.nextInt();
        }
        u1=gMat(1,1,a);u2=gMat(1,1,b);
        u3=Mat.add(u1,u2);
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++) c[i][j]=u3.t[i][j];
        }

        u1=gMat(1,n+1,a);u2=gMat(1,n+1,b);
        u3=Mat.mul(u1,Mat.trans(u2));
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++) c[i][n+j]=u3.t[i][j];
        }

        u1=gMat(n+1,1,a);u2=gMat(n+1,1,b);
        u3=Mat.mul(u2,Mat.trans(u1));
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++) c[n+i][j]=u3.t[i][j];
        }

        u1=gMat(n+1,n+1,a);u2=gMat(n+1,n+1,b);
        u3=Mat.sub(u1,u2);
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++) c[n+i][n+j]=u3.t[i][j];
        }
        for(i=1;i<=m;i++)
        {
            for(j=1;j<=m;j++)
            {
                System.out.printf("%d ",c[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
