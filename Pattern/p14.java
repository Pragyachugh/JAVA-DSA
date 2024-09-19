package Pattern;
public class p14
{
    public static void main(String[] args)
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int k=(n-i);k>=1;k--)
            System.out.print("  ");
            for(int j=1;j<=i;j++)
            System.out.print("* ");
            System.out.println();
        }
        for(int i=1;i<=(n-1);i++)
        {
            for(int k=1;k<=i;k++)
            System.out.print("  ");
            for(int j=(n-i);j>=1;j--)
            System.out.print("* ");
            System.out.println();   
        }
    }
}