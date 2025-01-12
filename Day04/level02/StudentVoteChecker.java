import java.util.Scanner;
class StudentVoteChecker{
	
	public static boolean canStudentVote(int age){
		// check age is not negative
	if (age < 0) {
            return false;
        }
        // Check age is 18 or above 
        return age >= 18;
    }
		
	
	public static void main(String[] args){
		
	  // Creating Scanner object to take input from user
	  Scanner input = new Scanner(System.in);
	  
	  // creating an array of ages
	  int age[] = new int[10];
	  
	  // loop for input for get student age
	  for(int currentPostion=0; currentPostion<age.length;currentPostion++){
        
		// taking StudAge as input
		System.out.print("\nEnter student age : "+(currentPostion+1)+" ");
	    age[currentPostion]= input.nextInt();
	  }
	  
        // check eligibility for voting
	    for(int currentPostion=0; currentPostion<age.length;currentPostion++){
			boolean results = canStudentVote(age[currentPostion]);
		
		if(results){
			
			System.out.println("The student with the age "+age[currentPostion]+" can vote ");
		}
		else{
			
			System.out.println("The student with the age "+age[currentPostion]+" cannot vote ");
		}
	  }
	}
}
		
       	   
	  