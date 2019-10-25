public class SlopeOfTheLine {

    public static String slope(int x1, int y1, int x2, int y2){

        if (x1 == x2) {
            return "Vertical Line";
        }
        else
        {
            double slope = (y2 - y1) / (x2 - x1);
        }


    }




    public static void main(String[] args){

    }
}
