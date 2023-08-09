public class kary {
    public static void main(String[] args)
    {
        int n=Integer.parseInt(args[0]);
        int i=1;
        while(i<=n)
        {
            System.out.println("*");
            i=i+1;
            if(n%i !=0)
            {
                System.out.print("+");
            }
        
            
        

        }
        

    }
    
}
