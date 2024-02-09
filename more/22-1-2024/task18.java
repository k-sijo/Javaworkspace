import java.util.Scanner;

public class task18 {
    public static void main(String[] a){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :" );
        int input1 = input.nextInt();
        int temp = input1;

        int sum =0;
        int r;
        while(input1>0){
            r= input1 % 10;
            sum= sum+r*r*r;
            input1 = input1/10;
        }
        System.out.println(sum);

        if(temp==sum)
            System.out.println("It is a armstrong");
        else
            System.out.println("It is not a armstrong");
    }
}
