import java.util.*;



class Employee {
    int id ;
    String name;
    String Job;

    public void xyz(){
        
    Scanner input = new Scanner(System.in);
        System.out.println("Enter the ID :");
        id = input.nextInt();
        System.out.println("ID : "+id);
        System.out.println("Enter the name :");
        name = input.next();
        System.out.println("NAME : "+name);
        System.out.println("Enter the job :");
        Job = input.next();
        System.out.println("JOB : "+Job);
    }
    
}
class Salary {
    int Add_Pay;
    int net_pay;
    
    public void calc(){
        Scanner get = new Scanner(System.in);
        System.out.println("Enter the Basic pay :");
        int Basic_Pay = get.nextInt();
        System.out.println("Enter the HRA");
        int HRA = get.nextInt();
        System.out.println("Enter the Tax");
        int Tax = get.nextInt();

        Add_Pay = Basic_Pay + HRA;
         net_pay = Add_Pay-Tax;
    }

    public  void Display(){
        System.out.println("Salary :"+net_pay);
    }
    
}

public class SalaryFunction {
    public static void main(String[] args){
        Employee employee = new Employee();
        Salary salary = new Salary();

        employee.xyz();
        salary.calc();
        salary.Display();
    }
}
