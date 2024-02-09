import java.util.Scanner;

class Initialize {
     int a,b;
     void init(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 2 numbers :");
        a = input.nextInt();
        b = input.nextInt();
         }
}
 
class sum extends Initialize {
 void sumation(){
    int add = a+b;
    System.out.println("The addition value :"+add);
 }
 void subtract(){
    int sub = a-b;
    System.out.println("The subtration value :"+sub);
 }
 void product(){
    int multiple = a*b;
    System.out.println("The multiplication value :"+multiple);
 }
}

public class simpleInheritance {
    public static void main(String[] args) {
        sum Sum = new sum();
        Sum.init();
        Sum.product();
        Sum.sumation();
        Sum.subtract();
    
    }
}
