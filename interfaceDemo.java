import java.util.*;

class rectangle{
    int length;
    int breadth;
    int height;
    public void x(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length :");
        length = input.nextInt();
        System.out.println("Enter the breath :");
        breadth = input.nextInt();
        System.out.println("Enter the height :");
        height = input.nextInt();
    }
}
class area12 extends rectangle{
    int areas;
    public void Area(){
        areas = length*breadth;
        System.out.println("Area of the rec  : "+areas);
    }
}
class volume extends area12{
    int Volume;
    public void Volu(){
    Volume = length*breadth*height;
        System.out.println("volume of the rec : "+Volume);
    }
}


public class interfaceDemo {
    
    public static void main(String[] args) {
        volume vol= new volume();
        vol.x();
        vol.Area();
        vol.Volu();

    }
}
