public class Questiontwo {
    public static void main(String a[])
    {
        int Val1=98;
        int Val2=76;
        int Val3=69;
        int minimum=Math.min(Val1,Math.min(Val2,Val3));
        int maximum=Math.max(Val1,Math.max(Val2,Val3));
        int middle=Val1+Val2+Val3-minimum-maximum;
        System.out.println("The ascending order of values of the given numbers is " + minimum + "<" + middle + "<" + maximum );
       

    }

    
}
