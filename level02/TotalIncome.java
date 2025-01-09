import java.util.*;
 class TotalIncome {
    public static void main(String[]args){
		//Creating scanner object to take input
		Scanner input=new Scanner(System.in);

		//taking salary input
        System.out.println("Enter the salary : ");
		int salary=input.nextInt();

		//taking bonus as input
        System.out.println("Enter the bonus : ");
		int bonus=input.nextInt();

		//calculating income
		int income=salary+bonus;

		//Print salary, bonus and income
		System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+".Hence Total Income is INR "+income);

        //closing the object of scanner class.
        input.close();
	}
}
