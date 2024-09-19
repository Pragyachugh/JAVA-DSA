package Pattern;

public class p12 {
    public static void main(String[] args) 
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for (int k=(n-i);k>=1;k--)
            {
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++)
            {
                if (j%2==0)
                System.out.print("! ");
                else
                System.out.print("* ");
            }
            for (int j=2;j<=i;j++)
            {
                if ((i%2==0 && j%2==0)||(i%2!=0 && j%2!=0))
                System.out.print("* ");
                else
                System.out.print("! ");
            }
            System.out.println();
        }   
    }
        
}
