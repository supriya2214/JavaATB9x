package Task.task_23102024;

import java.util.Scanner;

public class calculationFunctions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= sc.nextInt();
        System.out.println("Enter the second number");
        int b= sc.nextInt();
        int addition= sum_of_two_num(a,b);
        System.out.println("Sum is :" + addition);
        int subtraction= sub_of_two_num(a,b);
        System.out.println("Subtraction is :" + subtraction);
        int multiplication= multiplication_of_two_num(a,b);
        System.out.println("multiplication_of_two_num is :" + multiplication);
        int division= division_of_two_number(a,b);
        System.out.println("Division is :" + division);
        }


     static int sum_of_two_num(int a, int b) {
         return a + b;

     }
    static int sub_of_two_num(int a, int b) {
        return a - b;
    }
    static int multiplication_of_two_num(int a, int b) {
        return a*b;
    }
    static int division_of_two_number(int a, int b) {
        return a / b;

    }

}
