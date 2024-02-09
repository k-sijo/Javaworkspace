public class swap {
    public static void main(String f[]){
        int[] num = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("before swap : "+  num[0]);
        System.out.println("before swap : "+  num[num.length -1]);


        int temp = num[0];
        num[0]=num[num.length -1];
        num[num.length -1] = temp;

        System.out.println("after swap : "+  num[0]);
        System.out.println("after swap : "+  num[num.length -1]);


    }
}
