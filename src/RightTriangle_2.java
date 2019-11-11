public class RightTriangle_2 {
    public static Boolean isTriangle(int a, int b, int c){
        if(a+b>c && b+c>a && a+c>b)
            return true;
            else
                return false;
    }
    public static void main(String[] args){


    }
}
