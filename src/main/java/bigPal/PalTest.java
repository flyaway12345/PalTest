package bigPal;

import java.sql.SQLOutput;
import java.util.Scanner;

import java.util.Scanner;
public class PalTest{
    public static void Pal(){
        //print
        String input = "";
        Scanner scan = new Scanner(System.in);
        int count = 0;
        System.out.println("Please enter 5 digits");
        String userInput = scan.nextLine();

        int length = userInput.length();
        int i = 0;
        for ( i = length - 1; i >= 0; i--) {
            input = input + userInput.charAt(i);

        } if (userInput.equals(input)){
            System.out.println("Is A Palindrome");
            i = 0;
        }
        else {
            //repeat if fail
            System.out.println("Not A Palindrome");
            //cut off after 3 (not working yet -_-)
            if(count != 3){
                count++;
                Pal();
            }



        }
    }


    public static void main(String[] args){
        Pal();
    }
}

