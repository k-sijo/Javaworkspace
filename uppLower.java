public class uppLower {
    public static void main (String[] a){
        String name ="Hi this is sijo";

        char[] rd = name.toCharArray();
        char x =rd[4];
        String rdx = new String(x);
        

        String lower = name.toLowerCase();
        String upper = name.toUpperCase();


        System.out.println(x);

        System.out.println(upper);
        System.out.println(lower);

    }
}
