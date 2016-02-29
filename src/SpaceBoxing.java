import java.util.Scanner;

public class SpaceBoxing {
    public static void main(String[] args){
        int weightEarth;
        int answer = 0;
        double weightPlanet;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Please enter your current earth weight: ");
        weightEarth = keyboard.nextInt();
        
        System.out.println("I have information for the following planets:");
        System.out.println("1. Venus        2. Mars      3. Jupiter");
        System.out.println("4. Saturn       5. Uranus    6. Neptune");
        System.out.println();
        
        System.out.print("which planet are you visiting? ");
        answer = keyboard.nextInt();
        
        //Note: Weight on Venus
        if(answer == 1){
            weightPlanet = weightEarth * 0.78;
            System.out.println("Your weight would be " + weightPlanet + " pounds"
                    + " on that planet.");
        }
        //Note: weight on Mars
        else if(answer == 2){
            weightPlanet = weightEarth * 0.39;
            System.out.println("Your weight would be " + weightPlanet + " pounds"
                    + " on that planet.");
        }
        //Note: weight on Jupiter
        else if(answer == 3){
            weightPlanet = weightEarth * 2.65;
            System.out.println("Your weight would be " + weightPlanet + " pounds"
                    + " on that planet.");
        }
        //Note: weight on Saturn
        else if( answer == 4){
            weightPlanet = weightEarth * 1.17;
            System.out.println("Your weight would be " + weightPlanet + " pounds"
                    + " on that planet.");
        }
        //Note: weight on Uranus
        else if(answer == 5){
            weightPlanet = weightEarth * 1.05;
            System.out.println("Your weight would be " + weightPlanet + " pounds"
                    + " on that planet.");
        }
        //Note: weight on Neptune
        else if(answer == 6){
            weightPlanet = weightEarth * 1.23;
            System.out.println("Your weight would be " + weightPlanet + " pounds"
                    + " on that planet.");
        }
        
        
    }
    
    
}
