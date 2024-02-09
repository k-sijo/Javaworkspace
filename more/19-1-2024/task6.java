import java.util.Scanner;

public class task6 {
    public static void main(String[] s) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the character: ");
        char value = input.next().charAt(0);

        if((value>='a' && value <='z')||(value>='A' && value <='Z')){
            System.out.println("It is an alphabet");
        }else if (value >='0' && value<='9'){
            System.out.println("It is an number");
        }else{
            System.out.println("other");

        }
    }
}
