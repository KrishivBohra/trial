public class checking {
    public static void main(String[] args)
    {
        int N=Integer.parseInt(args[0]);
        long factorial=1;
        int i=1;
        while (i<=N)
        {
            factorial *=i;
            i++;
        }
        System.out.println(factorial);
    }
    
}
