import java.util.*;
class ParameterOfSquare{
      public static void main(String[] args){
             //Creating an Scanner object 
             Scanner input = new Scanner(System.in);
         
             //Taking input of base from user.
             System.out.println("Please Enter value of Base of triangle : ");
             double baseInCm = input.nextDouble();
            
             //Taking input of height from user.
             System.out.println("Please Enter value of height of triangle : ");
             double heightInCm = input.nextDouble();
              
             //Calculating Area of triangle with value in centimeter.
             double areaOfTriangleInCm = (baseInCm*heightInCm)/2;
 
             //Converting the value of centimeter in inches.
             double baseInInches = baseInCm / 2.54d;
             double heightInInches = heightInCm / 2.54d;
   
             //Calculating the Area of triangle with values in inches.          
             double areaOfTriangleInInches = (baseInInches * heightInInches)/2;
             System.out.println("Area of triangle in CM is " + areaOfTriangleInCm + " and the area of triangle in inches is " + areaOfTriangleInInches);

             //closing the scanner 
            input.close();

      }
}