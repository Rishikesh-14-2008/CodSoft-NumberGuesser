
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    int num;
    Scanner sc = new Scanner(System.in);
    int randomNum = (int)(Math.random() * 100);
    System.out.println("Guess a number between 0 and 100: " );
    num = sc.nextInt();
    while(num!=randomNum){
      if(num>randomNum){
        System.out.println("The number you guessed is to high!");
        System.out.println("Guess a number between 0 and 100: " );
        num = sc.nextInt();
      }
      if(num<randomNum){
        System.out.println("The number you guessed is to low!");
        System.out.println("Guess a number between 0 and 100: " );
        num = sc.nextInt();
      }
    }
    System.out.println("Congrats, you have guessed the number!");
    
  }
  
}
