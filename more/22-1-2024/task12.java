import java.util.Scanner;

public class task12 {
    public static void main(String[ ] a){
        Scanner inp = new Scanner(System.in);
        int input1 = inp.nextInt();
        int sum =0;

        for(int i = 1;i<=input1; i++ ){
            sum =sum + i;
        }
        System.out.println("sum of "+input1 +" is : "+sum);
    }
}
