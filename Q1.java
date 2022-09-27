import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        int val,n;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("Please input a number to print the Multiplication Table [0 to terminate]:");
            val=sc.nextInt();
            if(val<0||val>9)
            {
                System.out.printf("Please input a number between [1,9]\n");
            }
            else if (val==0)
            {
                break;
            }
            else
            {
                int i,j;
                n=val;
                for(i=1;i<=n;i++)
                {
                    for(j=1;j<=i;j++)
                    {
                        System.out.printf("%d * %d = %-3d ",j,i,i*j);
                    }
                    System.out.println();
                }
            }
        }
    }
}
