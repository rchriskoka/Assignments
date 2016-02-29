import java.util.Scanner;

public class LittleQuiz {
    public static void main(String[] args){
        String response = "";
        int ans = 0;
        int ansOne = 1;
        int ansTwo = 2;
        int ansThree = 3;
        int counter = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Are you ready for a quiz? ");
        keyboard.next();
        
        if(response == ""){
            System.out.println("Okay, here it comes!");
            
            //Question 1
            System.out.println("Q1) What is the capital of Alaska?");
        
            System.out.println(ansOne + ") Melbourne");
            System.out.println(ansTwo + ") Anchorage");
            System.out.println(ansThree  + ") Juneau");
            ans = keyboard.nextInt();
            
            if(ans == ansThree){
                System.out.println("That's right!");
                counter++;
            }
            else {
                System.out.println("Sorry, " + ans + " is not the capital of Alaska.");
            }
            System.out.println();
            
            //Question 2
            System.out.println("Q2) Can you store the value \"cat\" is a string. ints can "
                    + "only store numbers.");
            System.out.println(ansOne + ") yes");
            System.out.println(ansTwo + ") no");
            ans = keyboard.nextInt();
            
            if(ans == ansOne){
                System.out.println("That's right!");
                counter++;
            }
            else
            {
                System.out.println("Sorry, \"cat\" is a string. ints can only store numbers");
            }
            System.out.println();
            
            //Question 3
            System.out.println("Q3) What is the result of 9+6/3?");
            int value = 9 + 6/ 3;
            System.out.println(ansOne + ") 5");
            System.out.println(ansTwo + ") 11");
            System.out.println(ansThree + ") 15/3");
            ans = keyboard.nextInt();
            if(ans == ansTwo){
                System.out.println("That's right!");
                counter++;
            }
            else
            {
                System.out.println("You're wrong!");
            }
            System.out.println();
            System.out.println("Overall, you got " + counter + " out of 3 correct.");
            System.out.println("Thanks for playing!");
        }
        
        
        
    }
    
}
