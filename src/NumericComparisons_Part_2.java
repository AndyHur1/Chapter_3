import java.util.Scanner;

public class NumericComparisons_Part_2 {


    public static boolean isFactor(int num_1, int num_2) {

        return num_2 % num_1==0;
    }
    public static boolean isMultiple(int num_1, int num_2) {

        return num_1 % num_2==0;
    }
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please type first number");
        int num_a = scan.nextInt();
        System.out.println("Please type second number");
        int num_b = scan.nextInt();
        System.out.println(num_a+" is factor of "+num_b+": "+isFactor(num_a,num_b) );
        System.out.println(num_a+" is Multiple of "+num_b+": "+isMultiple(num_a,num_b));
    }
}
