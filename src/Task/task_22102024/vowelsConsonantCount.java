package Task.task_22102024;

import java.util.Scanner;

public class vowelsConsonantCount {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string :");
        String str= sc.next();
        int vCount=0;
        int cCount=0;
        str= str.toLowerCase();
        for(int i=0; i< str.length(); i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'
                    ||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vCount++;
            }
            else if(str.charAt(i)>='a' && str.charAt(i)<='z')
                cCount++;

        }
        System.out.println("Vowel count is :" + vCount);
        System.out.println("Consonent count is :" + cCount);

    }
}
