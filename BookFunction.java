import java.util.*;;

 class Display {
public void display(String Name, String Title , String Author){
    System.out.println("The name of the book is :"+Name);
    System.out.println("The tittle of the book is :"+Title);
    System.out.println("The Author of the "+Title+"is :"+Author);

}
    
}

public class BookFunction {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String Name = input.nextLine();
        String Title = input.nextLine();
        String Author =  input.nextLine();

        Display d =new Display();
        d.display(Name,Name,Author);
    }
}
