import java.util.Scanner;

class Person {
    String name;
    int age;
    public Person(String username, int userage ){
         name = username ;
         age = userage;
    }

    public void display(){
        System.out.println(name);
        System.out.println(age);
    }

    
}

public class PersonConstroctor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person person = new Person(null, 0);

        System.out.println("Enter the name");
        String name =input.nextLine();

        System.out.println("Enter the age");
        int age = input.nextInt();
        person.display();
    }
}
