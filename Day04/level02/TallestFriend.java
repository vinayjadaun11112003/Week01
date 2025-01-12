import java.util.*;

class TallestFriend {
	
	public static void yougestTallest(double age[],double height[],String name[]){
		
		// Assume amar is yougest with this we calculate yougest age 
		double youngest = age[0];
		String youngestFriend = name[0];
		
		// Assume amar is tallest with this we calculate tallest height
		double tallest = height[0];
		String tallestFriend = name[0];
		
		for(int i=0;i<3;i++){
			if(youngest>age[i]){
				youngest = age[i];
				youngestFriend = name[i];
			}
			if(tallest<height[i]){
				tallest = height[i];
				tallestFriend = name[i];
			}
		}

        // Display the youngest friend and tallest friend
        System.out.println("The youngest friend is " + youngestFriend + " with age " + youngest);
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallest);
		
	}
	
	
    public static void main(String[] args) {
		
        // Creating the Scanner object to read input
        Scanner input = new Scanner(System.in);
        
		// creating Age and Height array for 3 friends
		double age[] = new double[3];
		double height[] = new double[3];
		String name[] = {"Amar","Akbar","Anthony"};
		
		
		
		for(int i=0;i<3;i++){
			  
	   System.out.print("Enter the Age "+name[i] +" : ");
	  
	   // Taking variable age as input for user
	    age[i] = input.nextDouble();
	  
	    System.out.print("Enter the height "+name[i]+" : ");
	  
	     // Taking variable height as input for user
	    height[i] = input.nextDouble();
		}
		yougestTallest( age, height, name);
    }
}