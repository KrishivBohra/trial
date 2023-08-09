public class Conditionals {
    public static void main(String[] args)
    {
        int A=Integer.parseInt(args[0]);
        int B=Integer.parseInt(args[1]);
        int C=Integer.parseInt(args[2]);
        if (B<A)
        {int t=A;A=B;B=t;}
        if (C<A)
        {int t=A;A=C;C=t;}
        if (C<B)
        {int t=B;B=C;C=t;}
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

    }
    
}
