import java.util.Scanner;
public class P2 {
    public static void main(String[] args) {
        int T;
        double x1,y1,x2,y2,x,k,b,ans;
        Scanner sc=new Scanner(System.in);
        T=sc.nextInt();
        while(T-->0)
        {
            x1=sc.nextDouble();y1=sc.nextDouble();
            x2=sc.nextDouble();y2=sc.nextDouble();
            x=sc.nextDouble();
            k=(y1-y2)/(x1-x2);b=y1-x1*k;
            ans=x*k+b;
            System.out.printf("%.1f\n",ans);
        }
    }
}
