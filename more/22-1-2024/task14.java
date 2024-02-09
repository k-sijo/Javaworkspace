import java.util.Scanner;

public class task14 {
    public static void main(String[ ] d){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :" );
        int input1 = input.nextInt();

        for(int i =1; i<=10;i++){
            int table = i * input1;
            System.out.println(i+" X "+ input1 +" = " +table);
        }
    }
}
