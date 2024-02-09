import java.util.Scanner;
public class task1 {
    public static void main(String[] g){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int in1 = input.nextInt();
        int in2 = input.nextInt();
        int in3 = input.nextInt();

        if(in1 == in2 && in2 == in3 && in3 == in1){
            System.out.println("All the inputs are equal");
        } else if (in1 == in2 || in2 == in3 || in3 == in1) {
            System.out.println("two num are equal");
        }
    }
}
