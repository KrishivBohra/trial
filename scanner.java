import java.util.*;
public class scanner {
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        int N=scanner.nextInt();
        String S=scanner.next();
        scanner.close();
        int fn=2*N;
        System.out.println(fn);
        System.out.println(S);
    }
    
}
