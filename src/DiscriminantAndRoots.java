public class DiscriminantAndRoots {
    public static String roots(int a, int b, int c){

        double root = b^2-4*a*c;
        if (root == 0){
            return a+"x^2 + "+b+"x + "+c+" has 1 real root";
        }else if (root < 0){
            return a+"x^2 + "+b+"x + "+c+" has 2 imaginary root";
        }else if (root > 0){
            return  a+"x^2 + "+b+"x + "+c+" has 2 real root";
        }
    }
}
