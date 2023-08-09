import java.util.*;
public class hacker {
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        int N=scanner.nextInt();
        
        scanner.close();
        int i=1;
        int result=1;
        if(N>=2&&N<=20){
            while(i<=10){
                
                result =N*i;
                i=i+1;
                int x=i-1;
                System.out.println(N+" x "+x+" = "+result);
                
            }
        }
    }

    
}
