import java.util.Scanner;
import java.util.Random;
public class RandomGuessNumber{
    private int lowerBound;
    private int upperBound;
    private int secretNumber;
    private int maxAttempts;
    private int score;
    public RandomGuessNumber(int lowerBound,int upperBound,int maxAttempts){
        this.lowerBound=lowerBound;
        this.upperBound=upperBound;
        this.maxAttempts=maxAttempts;
        this.score=0;
    }
    public void PlayRound(){
        Random random=new Random();
        secretNumber=random.nextInt(upperBound-lowerBound+1)+lowerBound;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Guess a Number between " +lowerBound +" and " +upperBound +".");
        int attempts=0;
        while(attempts<maxAttempts){
            System.out.print("Enter Your Guess : ");
            int guess=scanner.nextInt();
            attempts++;
            if(guess==secretNumber){
                System.out.println("Congratulations! You have Guessed Correct Number ");
                score+=maxAttempts-attempts+1;
                break;
            }
            else if(guess<secretNumber){
                System.out.println("Please Try Again! Your Number is Less than Guess");
            }
            else{
                System.out.println("Please Try Again! Your Number is High than Guess");
            }
        }
        if(attempts==maxAttempts){
            System.out.println("Out of Attempts! Correct Number was " +secretNumber);
        }
    }
    void Play(){
        Scanner scanner=new Scanner(System.in);
        boolean playAgain=true;
        while(playAgain){
            PlayRound();
            System.out.println("Do ypou want to play again(Yes/No)?");
            String choice=scanner.next();
            if(!choice.equalsIgnoreCase("yes")){
                playAgain=false;
            }
        }
        System.out.println("Game Over! \nYour Total Score is : " +score);
    }
    public static void main(String[] args){
        RandomGuessNumber game=new RandomGuessNumber(1,100,5);
        game.Play();
    }
}