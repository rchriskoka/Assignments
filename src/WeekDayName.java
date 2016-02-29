
public class WeekDayName {
    public static void main(String[] args){
        
        int dayNumber = 0;
        dayNumber++;
       
        if(dayNumber == 1){
            System.out.println("Weekday " + dayNumber +": Sunday");
            dayNumber++;
        }
        if (dayNumber == 2){
            System.out.println("Weekday " + dayNumber +": Monday");
            dayNumber++;
        }
        if (dayNumber == 3){
            System.out.println("Weekday " + dayNumber +": Tuesday");
            dayNumber++;
        }
        if (dayNumber == 4){
            System.out.println("Weekday " + dayNumber +": Wednesday");
            dayNumber++;
        }
        if (dayNumber == 5){
            System.out.println("Weekday " + dayNumber + ": Thursday");
            dayNumber++;
        }
        if(dayNumber == 6){
            System.out.println("Weekday " + dayNumber + ": Friday");
            dayNumber++;
        }
        if (dayNumber == 7){
            System.out.println("Weekday " + dayNumber +": Saturday");
            dayNumber++;
        } 
        dayNumber = 0;
        
        if (dayNumber == 0){
            System.out.println("Weekday " + dayNumber + ": Saturday");
        }
        System.out.println();
        
        dayNumber =+ 43;
        if(dayNumber > 7 || dayNumber < 0){
                System.out.println("Weekday " + dayNumber + ": error");
                dayNumber = 17;
                System.out.println("Weekday " + dayNumber + ": error");
                dayNumber = -1;
                System.out.println("Weekday " + dayNumber + ": error");
            }
        
        System.out.println();
        System.out.println("Today is a Wednesday!");
        
    }
    
}
