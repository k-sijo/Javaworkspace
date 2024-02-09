public class oddPosition {
    public static void main (String[] a){
        String name ="Hi this is sijo";
        
        for(int i=0;i<=name.length();i++){
            if(i % 2 !=0){
                System.out.println(name.charAt(i)) ;
            }
        }
    }
}
