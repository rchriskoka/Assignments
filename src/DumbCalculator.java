import java.util.Scanner;

public class DumbCalculator {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double no1, no2, no3, result;
        
        System.out.print("What is your first number? ");
        no1 = keyboard.nextDouble();
        System.out.print("What is your second number? ");
        no2 = keyboard.nextDouble();
        System.out.print("What is your third number? ");
        no3 = keyboard.nextDouble();
        result = (no1+no2+no3)/2;
        System.out.println( "( "+no1+" + "+no2+" + "+no3+")"+"/2"+" is .... "+result);
        
        
    }
    
}
