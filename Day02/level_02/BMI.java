import java.util.*;
 class BMI{
    public static void main(String[] args) {
        //creating scanner object to take input
        Scanner input = new Scanner(System.in);
        //taking the input of height and weight in cm and kg.
        System.out.println("Enter the your weight : ");
        double weightInKg = input.nextDouble();
        System.out.println("Enter the your height : ");
        double heightInCm = input.nextDouble();
        //converting height in cm to height in meter
        double heightInMeter = heightInCm / 100;
        double BMI = weightInKg / (heightInMeter * heightInMeter);
        if(BMI <= 18.4){
             System.out.println("Underweight");
        }else if((BMI<24.9) && (BMI>18.5)){
             System.out.println("Normal");
        }else if((BMI<39.9) && (BMI>25.0)){
             System.out.println("Overweight");
        }else{
             System.out.println("Obese");
        }
        //closing the scanner object.
        input.close();
    }
}
