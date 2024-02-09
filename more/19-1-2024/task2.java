import java.util.Scanner;
public class task2 {
    public static void main(String[] g){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int in1 = input.nextInt();

        if(in1 % 2==0){
            System.out.println("it is a even number");
        }else{
            System.out.println("it is a odd number");
        }
    }
}
