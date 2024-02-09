import java.util.Scanner;

public class task9 {
    public static void main(String[] s) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number for a month 1-12: ");
        int value = input.nextInt();
        switch (value){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println("Num of days are 31");
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                System.out.println("Num of days are 30");
                break;
            case 2 :
                System.out.println("no of days may be 28 or 29");
            default:
                System.out.println("Invalid");

        }
    }
}
