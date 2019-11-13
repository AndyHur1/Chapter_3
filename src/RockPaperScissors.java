import java.util.Scanner;

/*Andy Hur
* 11/13/2019
* RockPaperScissors Program */
public class RockPaperScissors {
    public static String getUserChoice(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please choose either rock, paper, or scissors.");
        String user_choice = scan.next();
        return user_choice.toLowerCase();
    }
    public static String getComputerChoice() {
        int com_choice = (int) ((Math.random() * 3) + 1);
        if (com_choice == 1)
            return "rock";
        else if (com_choice == 2)
            return "scissors";
        else
            return "paper";
    }
    public static String whoWins(String computer, String person) {
        String user_win = "You win!";
        String com_win = "The computer wins!";
        String winner_1;
        /*Setting up the all the possible cases between player and computer */

        if (computer.equals(person)) {
            winner_1 = "You tied!";
        } else if
            (computer.equals("rock") && person.equals("paper")){
            winner_1 = user_win;
        }else if (computer.equals("rock") && person.equals("scissors")){
            winner_1 = com_win;
    }else if (computer.equals("paper")&&person.equals("rock")){
             winner_1 =  com_win;

        } else if (computer.equals("paper")&&person.equals("scissors")) {
            winner_1 = user_win;
        }else if (computer.equals("scissors")&&person.equals("rock")) {
            winner_1 = user_win;
        }else if (computer.equals("scissors")&&person.equals("paper")) {
            winner_1 = com_win;
        }else return "invalid";

        return "You chose "+person+".\n"+"The computer chose "+computer+"."+"\n"+winner_1;
    }
    public static void main(String[] args){
        String user_choice = getUserChoice();
        String computer_choice = getComputerChoice();
        System.out.println(whoWins(computer_choice,user_choice));
    }
}
