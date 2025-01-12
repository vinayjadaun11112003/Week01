import java.util.Scanner;
public class FootballTeam{

	//method returns sum of all elements
	public static int sum(int height[]){
		int sum=0;
		for(int i=0;i<height.length;i++){
			sum=sum+height[i];
		}
		return sum;
	}

	//method returns sum of all elements
	public static int mean(int[]height){

		int sum=sum(height);
		int mean=sum/height.length;
		
		return mean;
	}

	//method returns sum of all elements
	public static int shortest(int height[]){
		int shortest=Integer.MAX_VALUE;
		for(int i=0;i<height.length;i++){
			if(height[i]<shortest)
				shortest=height[i];
		}
		return shortest;
	}

	//method returns sum of all elements
	public static int tallest(int height[]){
		int tallest=Integer.MIN_VALUE;
		for(int i=0;i<height.length;i++){
			if(height[i]>tallest)
				tallest=height[i];
		}
		return tallest;

	}

	public static void main(String[]args){
		Scanner input =new Scanner(System.in);

		int[]height=new int[11];		//initialising height array

		System.out.println("Enter height of all the players");
		for(int i=0;i<height.length;i++){
			height[i]=input.nextInt();
		}
		int sumOfAll=sum(height);		//calling of method sum
		int meanOfAll=mean(height);		//calling of method mean
		int shortestOfAll=shortest(height);	//calling of method shortest
		int tallestOfAll=tallest(height);	//calling of method tallest
	
		//printing all results
		System.out.println("Sum of all elements "+sumOfAll);
		System.out.println("Mean of all elements "+meanOfAll);
		System.out.println("Shortest among all elements "+shortestOfAll);
		System.out.println("Tallest among all elements "+tallestOfAll);
	}

		
}