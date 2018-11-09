package javaapplication6;
import java.util.Scanner;
public class guessingGame {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
              
   int x = 789;
   int guess;

   System.out.println("Guess a number from 1 to 1000");
   guess = sc.nextInt();
  
    while(guess != x){
        if (guess > x){  
            System.out.println("the number is lower than your guess!");
        }
        if (guess < x){ 
            System.out.println("the number is higher than your guess!");
        }
        if (guess % 2 != 1){ 
            System.out.println("the number to be guessed is odd");    
        }
      System.out.println("Guess a number from 1 to 1000");
   guess = sc.nextInt();
        }
// (guess == x){
        System.out.println("Congratulations. You guessed the number!");
    // }
    
    }
}








           
  
      
     
      
  
