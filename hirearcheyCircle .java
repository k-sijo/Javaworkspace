import java.util.*;

class varab{
    int rad;
    double py;
    void usage(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radious :");
        rad = input.nextInt();
        System.out.println("Enter the py :");
        py = input.nextDouble();
    }
}
class area extends varab{
    double areas;
    void Area(){
        areas = py*rad*rad;
        System.out.println("Area of the circle :"+areas);
    }
}
class peremeter extends varab{
    double areas;
    void circumstance(){
        areas = 2*py*rad;
        System.out.println("peremeter of the circle :"+areas);
    }
}

class hirearcheyCircle  {
    public static void main(String[] args) {
        peremeter per = new peremeter();
        area Ar = new area();
        Ar.usage();
        per.usage();
        Ar.Area();
        per.circumstance();
    }
}
