import java.util.Scanner;

public class NumericComparisons_Part_1 {
    public static boolean isOdd(int num) {

        return num % 2 != 0;
    }
    public static boolean isPositive(int num) {

        return num > 0;
    }
    public static boolean isNegative(int num) {

        return num < 0;
    }
    public static boolean isNonNegative(int num) {

        return num >= 0;
    }
    public static boolean isNonPostive(int num) {

        return num <= 0;
    }

        public static void main(String[] args){

            Scanner scan = new Scanner(System.in);
            int num1 = scan.nextInt();
            System.out.println(num1 + "is odd" + isOdd(num1));
            System.out.println(num1 + "is Positive"+isPositive(num1) );
            System.out.println(num1+"is Negative"+isNegative(num1));
            System.out.println(num1+"is NonNegative"+isNonNegative(num1));
            System.out.println(num1+"is NonPositive"+isNonPostive(num1));




        }
}
