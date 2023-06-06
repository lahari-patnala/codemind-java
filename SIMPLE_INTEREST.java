import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p,t,r,I;
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextInt();
        I=(p*t*r)/100;
        System.out.println(I);
        sc.close();
    }
}