public class task1 {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,10};
        int evenCount = 0;
        int oddCount =0;
        System.out.println("Even number :");
        for(int i : num){
            if(i % 2==0){
                    System.out.println(i);
                    evenCount++;
            }
        }
        System.out.println("count of even number : " + evenCount);
        System.out.println("Odd number :");
        for(int i : num){
            if(i % 2!=0){
                    System.out.println(i);
                    oddCount++;
            }
        }
        System.out.println("count of even number : " + oddCount);
    }
}
