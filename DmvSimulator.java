import java.util.Random;
import java.util.Scanner;
public class DmvSimulator {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Welcome to the DMV");
        //Random number
        Random r = new Random();
        
        int randomNum = r.nextInt((200 - 1) + 1) + 1;
        System.out.println("Your number is: " + randomNum);
        CountDown(randomNum);
        CountUp(randomNum);
        System.out.println("You dont have the required paper work!");
    }
    public static void CountDown(int randomNum){
        for(int i = randomNum + 1; i <= 200; i++){
           
            System.out.println(i);
        }
        
    }
    public static void CountUp(int randomNum){
        for(int i = 1; i <= randomNum; i++){
           
            System.out.println(i);
        }
        
    }
}
