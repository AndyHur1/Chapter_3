import java.util.Scanner;

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
    public static String whoWins(String computer, String person){
        String user_win = "You Win!";
        String com_win = "The computer wins!";
        String tie = "You Tied!";

        if (computer.equals(person))
            return tie;
        else if (computer.equals("rock")&&person.equals("paper"))
            return user_win;
        else if (computer.equals("rock")&&person.equals("scissors"))
            return com_win;
        else if (computer.equals("paper")&&person.equals("rock"))
            return com_win;
        else if (computer.equals("paper")&&person.equals("scissors"))
            return user_win;
        else if (computer.equals("scissors")&&person.equals("rock"))
            return user_win;
        else if (computer.equals("scissors")&&person.equals("paper"))
            return com_win;
        else return "invalid";
    }
    public static void main(String[] args){
        String user_choice = getUserChoice();
        String computer_choice = getComputerChoice();
        System.out.println(whoWins(computer_choice,user_choice));
    }
}
