import java.util.Scanner;

public class FindTheLargest {
    public static void main(String[] args){

        Scanner num = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num_a = num.nextInt();
        System.out.print("Enter the second number: ");
        int num_b = num.nextInt();

        if (num_a>num_b)
            System.out.println(num_a+" is larger than "+num_b);

        if (num_a==num_b)
            System.out.println(num_a+" and "+num_b+" are equal");

        if (num_a<num_b)
            System.out.println(num_b+" is larger than "+num_a);
    }
}
