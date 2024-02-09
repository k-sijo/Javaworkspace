public class Stringss {
    public static void main(String[] a){
        String namer ="     hi im sijo     ";
        String name2 ="this is java prog";
        String name4 = " this is a sample";
        String name5 ="this is java prog";
        String name3="";


        char ch[]=namer.toCharArray();  
        String rev="";  
        for(int i=ch.length-1;i>=0;i--){  
            rev+=ch[i];  
        }  
        System.out.println("For reverse a string :"+rev);

        System.out.println("For compare two str :"+name2.compareTo(namer));

        System.out.println("For time :"+namer.trim());

        System.out.println("For isEmpty :"+name3.isEmpty());

        System.out.println("For concat :"+namer.concat(name4));

        System.out.println("For containing sequence  :"+namer.contains("e"));

        System.out.println("For substring :"+name2.substring(5,14));

        System.out.println("For equal :"+name2.equals(name5));

    }
}
        
    
