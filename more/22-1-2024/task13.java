import java.util.Scanner;

public class task13 {
    public static void main(String[ ] a){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number :" );
        int input1 = inp.nextInt();
        int pro =1;

        for(int i = 1;i<=input1; i++ ){
            pro =pro * i;
        }
        System.out.println("product of "+input1 +" is : "+pro);
    }
}
