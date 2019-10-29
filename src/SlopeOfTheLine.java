import java.util.Scanner;

public class SlopeOfTheLine {

    public static String slope(int x1, int y1, int x2, int y2) {

        if (x1 == x2) {
            return "The line defined by the points ("+x1+", "+y1+") and ("+x2+", "+y2+") is a vertical line and the slope is undefined.";
        } else {
            double slope_1 = (y2 - y1);
            double slope_2 = (x2 - x1);
            double slope = slope_1/slope_2;
            return "The line defined by the points ("+x1+", "+y1+") and ("+x2+", "+y2+") has a slope of "+slope;
        }


    }





    public static void main(String[] args){

        Scanner graph = new Scanner(System.in);
        System.out.println("Enter x1:");
        int x1 = graph.nextInt();
        System.out.println("Enter y1: ");
        int y1 = graph.nextInt();
        System.out.println("Enter x2: ");
        int x2 = graph.nextInt();
        System.out.println("Enter y2: ");
        int y2 = graph.nextInt();
        System.out.println(slope(x1,y1,x2,y2));
    }
}
