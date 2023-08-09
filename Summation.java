public class Summation{
    public static void main(String[] args)
    {
        int n=Integer.parseInt(args[0]);
        int i=0;
        int sum=0;
        while(i<=n)
        {
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }

}
