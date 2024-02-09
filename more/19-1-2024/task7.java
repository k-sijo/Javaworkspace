import java.util.Scanner;

public class task7 {
    public static void main(String[] s) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the character: ");
        char value = input.next().charAt(0);

        switch (value){
            case 'a' :
            case 'A' :
                System.out.println("a is a vowel letter");
                break;
            case 'e' :
            case 'E' :
                System.out.println("e is a vowel letter");
                break;
            case 'i' :
            case 'I' :
                System.out.println("i is a vowel letter");
                break;
            case 'o' :
            case 'O' :
                System.out.println("o is a vowel letter");
                break;
            case 'u' :
            case 'U' :
                System.out.println("u is a vowel letter");
                break;
            default:
                System.out.println("It is a constant");
        }
    }
}
