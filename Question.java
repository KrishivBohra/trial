public class Question{
    public static void main(String a[])
    {
        double X=Math.random();
        double Y=Math.random();
        double Z=Math.random();
        double W=Math.random();
        double V=Math.random();
        double avg= (X+Y+Z+W+V)/5;
        System.out.println("The average of the five random values is =" + avg);
        double minimum=Math.min(X,Math.min(Y,Math.min(Z,Math.min(W,V))));
        System.out.println("The minimum of the five random values is =" + minimum);
        double maximum=Math.max(X,Math.max(Y,Math.max(Z,Math.max(W,V))));
        System.out.println("The maximum of the five random values is =" + maximum);

    }
    
}
