import java.util.Scanner;
public class P4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T,a,b,c,d,S;
        a=b=c=d=0;
        T=sc.nextInt();
        while(T-->0)
        {
            S= sc.nextInt();;
            if(S>=90&&S<=100) a++;
            if(S>=80&&S<90) b++;
            if(S>=70&&S<80) c++;
            if(S>=60&&S<70) d++;
        }
        System.out.printf("A: %d\n",a);
        System.out.printf("B: %d\n",b);
        System.out.printf("C: %d\n",c);
        System.out.printf("D: %d\n",d);
    }
}
