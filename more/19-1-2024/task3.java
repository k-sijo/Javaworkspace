import java.util.Scanner;

public class task3 {
    public static void main(String[] s){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int in1 = input.nextInt();

        if (in1 % 5==0 && in1 % 11==0){
            System.out.println("the in1 is divisible by 5 and 11");
        }else
            System.out.println("not divisible by 5 and 11");
    }
}
