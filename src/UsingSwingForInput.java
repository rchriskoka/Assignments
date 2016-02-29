import java.util.Scanner;

public class UsingSwingForInput {
     public static void main(String[] arg)
        {
            String name=JOptionPane.showInputDialog("What is you name?");
            
            String input =JOptionPane.showInputDialog("How old are you?");
            int age= Integer.parseInt(input);
            
            System.out.print("Hello ,"+name+" , ");
            System.out.println("Next year. you'll be "+(age+1));
            System.exit(0);
        }
    
}
