public class pattern 
{
    public static void main(String[] args) 
    {
        int n = 5;
        //right facing triangle 
        for(int i=1;i<=5;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Left facing triangle
        for(int i=1;i<=n;i++)
        {
            for (int k=1;k<=(n-i);k++)
            {
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        //Inverted Right facing
        for (int i=n ; i>=1 ; i--){
            for (int j=1 ; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println("  ");
        }
        System.out.println();

        //Inverted left facing
        for (int i=n; i>=1; i--){
            for(int k=1;k<=(n-i);k++){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}