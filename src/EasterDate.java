import java.util.Scanner;

public class EasterDate {
    public static void main(String[] args){
        /*Andy Hur*/
        /*11.6.2019*/
        /*Create a basic Easter day calculator based on what year you typed in*/
        Scanner easter = new Scanner(System.in);
        System.out.println("Please enter a year between 1900 and 2099");
        int year = easter.nextInt();
        if(year>=1900&&year<=2099){
            /*This if statement makes separate between invalid year and valid year according to the given instruction*/
           int a = year % 19;
           int b = year % 4;
           int c = year % 7;
           int d = (19 * a + 24) % 30;
           int e = (2*b + 4*c + 6*d + 5) % 7;
           if(d+e+22>31){
               /*This if statement makes separate between April and March. Since March is until 31, when it is larger than 31 it moves to next month which is April*/
               String date_1 = "April "+(d+e+22-31);
               System.out.println("In "+year+" Easter is on "+date_1);
           }else{
               String date_2 = "March "+(d+e+22);
               System.out.println("In "+year+" Easter is on "+date_2);
           }

        }else{
            System.out.println("You have entered an invalid year");
        }


    }
}
