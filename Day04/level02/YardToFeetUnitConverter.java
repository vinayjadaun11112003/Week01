import java.util.Scanner;
class YardsToFeetUnitConvertor{
	
	 public static double unitConvertorYardsToFeet(double yards) {
		/* yards to feet = 3;
		 
		 */
		 return yards*3;
      
    }
	 public static double unitConvertorFeetToYards(double feet) {
		
		 // feet to yards = 0.333333
         return feet*0.333333;
      
    }
	 public static double unitConvertorMeterToInches(double meters) {
		/*		 
		  meters to inches = 39.3701;
				 */
		 return meters*39.3701;
      
    }
	 public static double unitConvertorInchesToMeter(double inches) {
		/* 
		 inches to meters = 0.0254;
		 */
		 return inches*0.0254;
      
    }
	 public static double unitConvertorInchesToCm(double inches2) {
		/* 
		 inches to cm = 2.54
		 */
		 return inches2 * 2.54;
      
    }
	
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
      // Display options to the user
        System.out.println("Select a conversion type:");
        System.out.println("1. yards to feet");
        System.out.println("2. feet to yards");
        System.out.println("3. Meters to inches");
        System.out.println("4. inches to Meters");
		System.out.println("4. inches to cm");
        System.out.print("Enter the number of your choice: ");
        
        int choice = input.nextInt(); 

        double result;
        
        switch (choice) {
            case 1:
                // call method convert yards to feet
                System.out.print("Enter yards: ");
                double yards = input.nextDouble();
                result = unitConvertorYardsToFeet(yards);
                System.out.println(yards + " yards is equal to " + result + " feet.");
                break;
                
            case 2:
                // call method convert feet to yards
                System.out.print("Enter feet: ");
                double feet = input.nextDouble();
                result = unitConvertorFeetToYards(feet);
                System.out.println(feet + " miles is equal to " + result + " yards.");
                break;
                
            case 3:
                // call method convert meters to feet
                System.out.print("Enter meters: ");
                double meters = input.nextDouble();
                result = unitConvertorMeterToInches(meters);
                System.out.println(meters + " meters is equal to " + result + " inches.");
                break;
                
            case 4:
                // call method convert inches to meters
                System.out.print("Enter inches: ");
                double inches = input.nextDouble();
                result = unitConvertorInchesToMeter(inches);
                System.out.println(inches + " inches is equal to " + result + " meters.");
                break;
				
			case 5:
                // call method convert inches to cm
                System.out.print("Enter inches: ");
                double inches2 = input.nextDouble();
                result = unitConvertorInchesToCm(inches2);
                System.out.println(inches2 + " inches is equal to " + result + " cm.");
                break;
                
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }
		
	}
}