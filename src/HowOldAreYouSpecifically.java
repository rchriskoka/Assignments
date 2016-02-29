import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args){
        
        String name;
        int age;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Hey, what's your name? (Sorry, I keep forgetting.)");
        name = keyboard.next();
        
        System.out.print("Ok, " + name + ", how old are you? ");
        age = keyboard.nextInt();
        System.out.println();
        
        if(age < 16){
            System.out.println("You can't drive, " + name);
            
        }
        else if( age >=16 && age <=17){
            System.out.println("You can drive but you can't vote, " + name);
            
        }
        else if(age >= 18 && age <=24){
            System.out.println("You can vote but you can't rent a car, " + name);
            
        }
        else if(age >= 25){
            System.out.println("YOu can do pretty much anything, " + name);
            
        }
    }
    
    
}
