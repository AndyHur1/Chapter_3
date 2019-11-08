import java.util.Scanner;

public class RightTriangle {
    public static Boolean isRight (int a, int b, int c) {


        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
            return true;
            else
                return false;

    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three integer sides of a triangle:");
        int length_1 = scan.nextInt();
        int length_2 = scan.nextInt();
        int length_3 = scan.nextInt();
        if(isRight(length_1,length_2,length_3)==true)
            System.out.println("The side lengths of "+length_1+","+length_2+","+" and "+length_3+" form a right triangle");
        else if(isRight(length_1,length_2,length_3)==false)
            if(length_1+length_2<length_3 && length_1+length_3<length_2 && length_2+length_3<length_1)
                System.out.println("The side lengths of "+length_1+","+length_2+","+" and "+length_3+" form a triangle," +
                        " but it is not a right triangle");
            else
        System.out.println("The side lengths of "+length_1+","+length_2+","+" and "+length_3+" do not form a triangle");
    }
}
