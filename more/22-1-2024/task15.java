import java.util.Scanner;

public class task15 {
    public static void main(String[] a){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :" );
        int input1 = input.nextInt();

        int sum = 0;
        int r;
        while(input1>0){
            r= input1 % 10;
            sum=sum + r;
            input1 = input1/10;
        }
        System.out.println(sum);
    }
}
