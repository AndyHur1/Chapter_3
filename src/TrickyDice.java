public class TrickyDice {
    public static int regularRoll(){
        int dice = (int) (Math.random()*6)+1;

        return dice;
    }
    public static int trickyRoll(){
        int set_up = (int) (Math.random()*20)+1;
        if (set_up>=6&&set_up<=10) {
           return set_up = 6;
        }else if(set_up>=10&&set_up<=20){
            return set_up=5;
        }else{
            return set_up;
        }
    }

    public static void main(String[] args) {
        System.out.println(regularRoll());
        System.out.println(trickyRoll());
    }
    }
