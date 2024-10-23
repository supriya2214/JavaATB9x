package Task.task_22102024;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reverse :");
        int num = sc.nextInt();
        int reverse = 0;
        for (int i = 0; num !=0 ; i++){
            // reminder -> reverse ->num
            int reminder = num%10;
             reverse = reverse*10 + reminder;
             num = num/10;

        }
        System.out.println(reverse);

    }
}
