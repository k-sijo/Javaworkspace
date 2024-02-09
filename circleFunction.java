import java.util.*;


public class circleFunction {

    public void area(float py , int r){
        float area = py*r*r;
        System.out.println("The area of the circle:"+area);
    }
    public void circumstance(float py , int r){
        float circumstance = 2*py*r;
        System.out.println("The circumstance of the circle :"+circumstance);
    }
    public static void main(String[] args){
        System.out.println("Enter the values:");
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        float py = input.nextFloat();

        circleFunction Cf = new circleFunction();
        Cf.area(py, r);
        Cf.circumstance(py, r);
    }
    
}