public class Onlyodd {
    public static void main(String f[]){
        int[] num = {3,5,4,7,9};
        boolean even = true;

        for(int i : num){
            if(i % 2!=0){
                    even = false;
            }
        }
        for(int i =0; i<num.length;i++){
        if(even == false){
                  System.out.println("the given arry is not a odd");

        }else
        System.out.println("the given array is odd");  
        break;
    }
}
}
