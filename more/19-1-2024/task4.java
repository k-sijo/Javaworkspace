import java.util.Scanner;

public class task4 {
    public static void main(String[] s) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = input.nextInt();

        if(year%4==0)
            System.out.println("it is a leap year");
        else
            System.out.println("it is  not aleap year");

    }
}
