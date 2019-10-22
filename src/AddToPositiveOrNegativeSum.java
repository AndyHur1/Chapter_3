import java.util.Scanner;

public class AddToPositiveOrNegativeSum {
    public static void main(String[] args){


        Scanner pos_neg = new Scanner(System.in);
        int pos=0;
        int neg=0;
        System.out.print("Enter a number: ");
        int num_1 = pos_neg.nextInt();
        if (num_1>0)
            pos+=num_1;
        if (num_1<0)
            neg+=num_1;
        System.out.print("Enter a number: ");
        int num_2 = pos_neg.nextInt();
         if (num_2>0)
             pos+=num_2;
         if (num_2<0)
             neg+=num_2;
     System.out.print("Enter a number: ");
     int num_3 = pos_neg.nextInt();
        if (num_3>0)
            pos+=num_3;
        if (num_3<0)
            neg+=num_3;
     System.out.print("Enter a number: ");
     int num_4 = pos_neg.nextInt();
        if (num_4>0)
            pos+=num_4;
        if (num_4<0)
            neg+=num_4;
     System.out.print("Enter a number: ");
     int num_5 = pos_neg.nextInt();
        if (num_5>0)
            pos+=num_5;
        if (num_5<0)
            neg+=num_5;
     System.out.print("Enter a number: ");
     int num_6 = pos_neg.nextInt();
        if (num_6>0)
            pos+=num_6;
        if (num_6<0)
            neg+=num_6;
     System.out.print("Enter a number: ");
     int num_7 = pos_neg.nextInt();
        if (num_7>0)
            pos+=num_7;
        if (num_7<0)
            neg+=num_7;
     System.out.print("Enter a number ");
     int num_8 = pos_neg.nextInt();
        if (num_8>0)
            pos+=num_8;
        if (num_8<0)
            neg+=num_8;
     System.out.print("Enter a number: ");
     int num_9 = pos_neg.nextInt();
        if (num_9>0)
            pos+=num_9;
        if (num_9<0)
            neg+=num_9;
     System.out.print("Enter a number: ");
     int num_10 = pos_neg.nextInt();
        if (num_10>0)
            pos+=num_10;
        if (num_10<0)
            neg+=num_10;
        System.out.println("The sum of the positive numbers is "+pos);
        System.out.println("The sum of the negative numbers is "+neg);

    }

}
