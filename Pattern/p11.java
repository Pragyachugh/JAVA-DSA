package Pattern;
public class p11 {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=(n-i);k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                if((i%2==0 && j%2==0)||(i%2!=0 && j%2==0)){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
                
            }
            for(int a=2;a<=i;a++)
            {
                if((i%2!=0 && a%2!=0) || (i%2==0 && a%2==0))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
