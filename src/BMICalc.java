import java.util.Scanner;
public class BMICalc {
    public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      
      float m , kg;
      float BMI;
      
      
      System.out.print("Your height in m: ");
      m = keyboard.nextFloat();
      System.out.print("Your weight in kg: ");
      kg = keyboard.nextFloat();
      BMI = kg/(m*m);
      System.out.println();
      System.out.print("Your BMI is " + BMI);
      System.out.println();
      
      float inches, pounds;
      float BMI2;
      
      System.out.print("Your height in inches: ");
      inches = keyboard.nextFloat();
      System.out.print("Your weight in pounds: ");
      pounds = keyboard.nextFloat();
      float cpounds, cinches;
      cpounds = (float) (pounds * 0.453592);
      cinches = (float) (inches * 0.0254);
      BMI2 = cpounds/(cinches*cinches);
      System.out.println();
      System.out.print("Your BMI is " + BMI2);
      
      
      
      
      
       
    }
    
    
}
