import java.util.Scanner;

public class StairCase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        findCompleteRows(n);
    }
    public static void findCompleteRows(int n)
    {
        int sum=0;
        int count=0;
        for(int i=1;i<n;i++)
        {
            sum+=1;
            if(sum<n)
            {
                n=n-i;
                count++;
            }
        }
        System.out.println(count);
    }
}
