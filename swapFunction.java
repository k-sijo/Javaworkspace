import java.util.Scanner;

class InnerSwap {
    public void swap(int input1, int input2){
        int temp = input1;
        input1 = input2;
        input2 = temp;
        System.out.println("After the swapping : ");

        System.out.println(input1);
        System.out.println(input2);
    }
    
}
public class swapFunction {
    public static void main (String[] args){
        System.out.println("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int input1 = input.nextInt();
        int input2 = input.nextInt();
       InnerSwap If = new InnerSwap();
       If.swap(input1, input2);

    }
}

