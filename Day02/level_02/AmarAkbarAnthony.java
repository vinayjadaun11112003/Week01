import java.util.*;
 class AmarAkbarAnthony{
    public static void main(String[] args) {
        //creating scanner object to take input
        Scanner input = new Scanner(System.in);
        //taking the input of height and age in cm and year.
        System.out.println("Enter the your height of amar : ");
        double heightAmar = input.nextDouble();

        System.out.println("Enter the your height of akbar : ");
        double heightAkbar = input.nextDouble();

    
        System.out.println("Enter the your height of anthony : ");
        double heightAnthony= input.nextDouble();
    

        System.out.println("Enter the your age of amar : ");
        int ageAmar = input.nextInt();

        System.out.println("Enter the your age of akbar : ");
        int ageAkbar = input.nextInt();

    
        System.out.println("Enter the your age of anthony : ");
        int ageAnthony = input.nextInt();
    
        if((heightAmar > heightAkbar ) && (heightAmar > heightAnthony)){
                System.out.println("The Tallest in three friends is Amar");
        }else if((heightAkbar > heightAmar ) && (heightAkbar > heightAnthony)){
                System.out.println("The Tallest in three friends is Akbar");
        }else if((heightAnthony > heightAmar ) && (heightAkbar < heightAnthony)){
                System.out.println("The Tallest in three friends is Anthony");
        }else{
                System.out.println("All three are of same height");
        }


         if((ageAmar < ageAkbar ) && (ageAmar < ageAnthony)){
                System.out.println("The youngest in three friends is Amar");
        }else if((ageAkbar < ageAmar ) && (ageAkbar < ageAnthony)){
                System.out.println("The youngest in three friends is Akbar");
        }else if((ageAnthony < ageAmar ) && (ageAkbar > ageAnthony)){
                System.out.println("The youngest in three friends is Anthony");
        }else{
                System.out.println("All three are of same height");
        }
        //closing the scanner object.
        input.close();
    }
}
