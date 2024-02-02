import java.util.Scanner;

class Gusser{
    int guessNum;
    public int gussingNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey guesser! please guess the number ");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class Umpaire{
    int numOfGusser;
    int numOfPlayer1;
    int numOfPlayer2;
    int numOfPlayer3;

    public void collectNumFromGusser(){
        Gusser g = new Gusser();
        numOfGusser = g.gussingNumber();
    }

    public void collectNumFromPlayer(){
        Palyer p1 = new Palyer();
        Palyer p2 = new Palyer();
        Palyer p3 = new Palyer();
        numOfPlayer1 = p1.gussingNumber();
        numOfPlayer2 = p2.gussingNumber();
        numOfPlayer3 = p3.gussingNumber();
    }

    public void compare(){
        if(numOfGusser == numOfPlayer1){
            if(numOfGusser == numOfPlayer2 && numOfGusser == numOfPlayer3){
                System.out.println("All player won this game");
            }
            else if(numOfGusser == numOfPlayer2){
                System.out.println("Both player 1 and 2 own this game!");
            }
            else if(numOfGusser == numOfPlayer3){
                System.out.println("Both player 1 and 3 own this game!");
            }
            else{
                System.out.println("Player 1 own the game!");
            }
        }
        else if(numOfGusser == numOfPlayer2){
            if(numOfGusser == numOfPlayer3){
                System.out.println("Player 2 and 3 also won this game");
            }
            else{
                System.out.println("Player 2 own the game!");
            }
        } 

        else if(numOfGusser == numOfPlayer3){
            System.out.println("Player 3 own this game");
        }
        else {
            System.out.println("Lost the game! Please try again");
        }
    }
}

class Palyer{
    int guessNum;
    public int gussingNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey Wellcom to my game and please guess the number ");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

public class gusserGame {
    public static void main(String[] args) {
        System.out.println("Game atarted");
        Umpaire u = new Umpaire();
        u.collectNumFromGusser();
        u.collectNumFromPlayer();
        u.compare();
    }
}
