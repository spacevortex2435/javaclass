import java.util.Arrays;
import java.util.Scanner;
public class D {
    static int i;static String ns;
    static char[] a=new char [10];
    static int[] b=new int [20];
    public static boolean Flush()
    {
        int i;
        for(i=2;i<=5;i++) if(a[i]!=a[1]) return false;
        return true;
    }
    public static boolean Straight()
    {
        int i;
        int[] h=new int[20];
        for(i=1;i<=5;i++) h[i]=b[i];
        Arrays.sort(h,1,6);
        //for(i=1;i<=5;i++) System.out.printf("%d %d\n",i,h[i]);
        for(i=1;i<=5;i++) if(h[i]-h[1]!=i-1) return false;
        return true;
    }
    public static boolean Three()
    {
        int i;
        int[] cnt=new int [20];
        for(i=1;i<=5;i++) cnt[b[i]]++;
        for(i=1;i<=13;i++) if(cnt[i]>=3) return true;
        return false;
    }
    public static boolean Two()
    {
        int i;
        int[] cnt=new int [20];
        for(i=1;i<=5;i++) cnt[b[i]]++;
        for(i=1;i<=13;i++) if(cnt[i]>=2) return true;
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        for(i=1;i<=5;i++)
        {
            ns=sc.next();a[i]=ns.charAt(0);
            b[i]=sc.nextInt();
        }
        if(Flush()&&Straight()) System.out.println("Straight Flush");
        else if(Flush()) System.out.println("Flush");
        else if(Straight()) System.out.println("Straight");
        else if(Three()) System.out.println("Three of a Kind");
        else if(Two()) System.out.println("Pair");
        else System.out.println("High Card");
        //for(i=1;)
    }
}
