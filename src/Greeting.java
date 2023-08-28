import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
//        String messege = greet();
//        System.out.println(messege);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name ");

        String You = input.next();
        String personalised = greetme(You);
        System.out.println(personalised);
    }

     static String greetme(String name) {
        String messege = "Hello "+ name;
        return messege;
    }


    static String greet(){

        String greeting = "How are you?";
        return greeting;


    }
}
