// take input of two numbers and input the sum


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//       int ans =  sum() ;
//        System.out.println(ans);
        int ans = sum2(23,56);
        System.out.println(ans);



        }
     // Pass the value of number when you are calling the method in main()
        static int sum2(int a , int b){
        int sum = a+b;
        return sum;

        }





      static int sum() {
          Scanner in = new Scanner(System.in);
          System.out.println("Enter numbers :  ");
          int num1 = in.nextInt();
          int num2 = in.nextInt();
          int sum = num1 + num2;
//          System.out.println(sum);
          return sum;
      }



}
