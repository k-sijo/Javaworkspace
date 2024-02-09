import java.util.*;

public class function1 {
    public static void main (String[] s){
        function1 fun = new function1();
        Scanner input = new Scanner(System.in);
        int a =input.nextInt();
        int b = input.nextInt();
        fun.Add(a, b);
        fun.Sub(a, b);
        fun.multi(a, b);
    }

    public void Add(int a , int b){
        int c= a+b;
        System.out.println("sum of two numbers :"+c);
    }
    public void Sub (int a, int b){
        int c= a-b;
        System.out.println("subtration of two numbers :"+c);
    }
    public void multi (int a, int b){
        int c= a*b;
        System.out.println("multiplication of two numbers :"+c);
    }
}
