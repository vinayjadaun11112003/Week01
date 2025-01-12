import java.util.*;
class SmallestAndLargest{
       public static int[] findSmallestAndLargest(int first, int second, int third){
              int smallestAndLargest[] = new int[2];
              if ((first>second) && (first>third)){
                    smallestAndLargest[1] = first;
              }else if((second>third) && (second>first)){
                    smallestAndLargest[1] = second;
              }else{
                    smallestAndLargest[1] = third;
              }
               if ((first<second) && (first<third)){
                    smallestAndLargest[0] = first;
              }else if((second<third) && (second<first)){
                    smallestAndLargest[0] = second;
              }else{
                    smallestAndLargest[0] = third;
              }
              return smallestAndLargest;
       }
       public static void main(String[] args){ 
             Scanner input = new Scanner(System.in);
             System.out.println("Enter first number : ");
             int first = input.nextInt();
             System.out.println("Enter second number : ");
             int second = input.nextInt();
             System.out.println("Enter third number : ");
             int third = input.nextInt();
             int ans[] = findSmallestAndLargest(first,second,third);
             System.out.println("The smallest number amongs these are " + ans[0]);
             System.out.println("The largest number amongs these are " + ans[1]);

             
             input.close();
       }
 }