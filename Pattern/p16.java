package Pattern;

public class p16 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        star(i,n);
        for (int i=n-1;i>=1;i--)
        star(i,n);
    }
    public static void star(int i,int n)
    {
        for(int k=n-i;k>=1;k--)
        System.out.print("  ");
        for(int j=n;j>=i;j--)
        System.out.print("* ");
        System.out.println();
    }
    
}
