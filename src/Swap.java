import static java.util.Collections.swap;

public class Swap {
    public static void main(String[] args) {

//        int a = 10;
//        int b= 20;
// swap numbers :
//        int temp = a;
//        a=b ;
//        b= temp;
//
//        System.out.println(a+" "+b );

        String name= "Ankur Debnath";
        changeName(name);
        System.out.println(name);


    }
    static void changeName(String naam){
        naam = "Rahul";

    }

     static void swap(int a, int b) {
         int temp = a;
         a=b ;
         b= temp;
    }
}





