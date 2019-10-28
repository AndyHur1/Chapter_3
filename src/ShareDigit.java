import java.util.Scanner;

public class ShareDigit {

    private static boolean share_digits (int x1,int x2){

        if (x1/10==x2/10){
            return true;
        } else if (x1%10==x2%10){
            return true;
        }else if (x1/10==x2%10){
            return true;
        }else if (x1%10==x2/10){
            return true;
        }else {
            return false;
        }
    }





    public static void main(String[] args){
        System.out.println(share_digits(12,23));
        System.out.println(share_digits(12,43));
        System.out.println(share_digits(12,44));
    }
}
