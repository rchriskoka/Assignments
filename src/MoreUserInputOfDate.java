import java.util.Scanner;

public class MoreUserInputOfDate {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        String first_name, last_name, login;
        int grade, Student_ID;
        float GPA;
        
        System.out.println("Please enter the following information so I can sell it for a profit ");
        System.out.println();
        System.out.print("First Name: ");
        first_name = keyboard.next();
        System.out.print("Last Name: ");
        last_name = keyboard.next();
        System.out.print("Grade(9-12): ");
        grade = keyboard.nextInt();
        System.out.print("Student ID: ");
        Student_ID = keyboard.nextInt();
        System.out.print("Login: ");
        login = keyboard.next();
        System.out.print("GPA (0.0-4.0): ");
        GPA = keyboard.nextFloat();
        
        System.out.println();
        System.out.println("Your information:");
        System.out.println("\t Login: " + login);
        System.out.println("\t ID: \t" + Student_ID);
        System.out.println("\t Name: \t" + last_name + "," + first_name);
        System.out.println("\t GPA: \t" + GPA);
        System.out.println("\t Grade: " + grade);
        
        
    }
}
