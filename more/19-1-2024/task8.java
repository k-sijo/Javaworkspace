import java.util.Scanner;

public class task8 {
    public static void main(String[] s) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number for week 1-7: ");
        int value = input.nextInt();

        switch (value){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
        }
    }
}
