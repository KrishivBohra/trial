import java.util.*;
public class solution {
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        int N=scanner.nextInt();
        scanner.close();
        if(N>=1&&N<=100){
        if(N%2 !=0||N==1)
        System.out.println("wierd");
        else{
            if(N%2==0){
                if(N>=2&&N<=5)
                System.out.println("not wierd");
                else{
                    if(N>=6&&N<=20)
                    System.out.println("wierd");
                    else{
                        if(N>20)
                    System.out.println("Not wierd");}}
                }
            }
        }
    }
    
}
