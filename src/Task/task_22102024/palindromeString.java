package Task.task_22102024;

import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str= sc.nextLine();
        str= str.toLowerCase();
        String reverseStr= "";
        int i= str.length()-1;
        while (i>=0){
            reverseStr= reverseStr + str.charAt(i);
            i--;

        }
        if(reverseStr.equals(str)) {
            System.out.println("String is palindrome.");
        }
        else {
            System.out.println("String is not palindrome.");
        }

    }

}
