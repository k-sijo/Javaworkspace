import java.util.Scanner;
public class task5 {
    public static  void main (String[] s){
        Scanner input= new Scanner(System.in);
        System.out.print("enter the character: ");
        char value = input.next().charAt(0);

        if((value>='a' && value <='z')||(value>='A' && value <='Z')){
            System.out.println("It is ana alphabet");
        }else{
            System.out.println("It is not a ");
        }
    }
}
