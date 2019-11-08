import java.util.Scanner;

public class CookieOrders {

    public static String totalCost(int numBoxes){

        if(numBoxes>=1&&numBoxes<=4)
            return "You bought" + numBoxes + "boxes of cookies at $6.95 per box. Your total bill is $" +
                    numBoxes * 6.95;
        else if (numBoxes>=5&&numBoxes<=9)
            return "You bought" + numBoxes + "boxes of cookies at $5.95 per box. Your total bill is $" +
                    numBoxes * 5.95;
        else  if (numBoxes>=10&&numBoxes<=15)
            return "You bought" + numBoxes + "boxes of cookies at $5.50 per box. Your total bill is $" +
                    numBoxes * 5.50;
        else if (numBoxes>=16)
            return "You bought" + numBoxes + "boxes of cookies at $4.95 per box. Your total bill is $" +
                    numBoxes * 4.95;
        else
            return "Your input is invalid";
    }
    public static void main(String[] args){

        Scanner amount = new Scanner(System.in);
        System.out.println("Enter the number of boxes you wish to purchase:");
        int boxes = amount.nextInt();
        System.out.println(totalCost(boxes));
    }
}
