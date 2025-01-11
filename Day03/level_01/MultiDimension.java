// Q.09 level 01:
import java.util.Scanner;
class MultiDimension {
    public static void main(String [] args){
        //creating scanner object for user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        //taking user input row and col
        int row = input.nextInt();
        System.out.print("Enter the number of columns : ");
        int col = input.nextInt();

        //creating a 2D array
        int multi[][] = new int[row][col];

        for(int i=0; i<row; i++){
            System.out.print("Enter " + ((i+1) + " row elements : "));
            for(int j=0; j<col; j++){
                multi[i][j] = input.nextInt();
            }
        }
        System.out.println();

        //creating a 1D array of length row*col
        int array[] = new int[row*col];

        int index = 0;

        //printing element of array
        System.out.print("Elements of 1D array : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                array[index] = multi[i][j];
                System.out.print(array[index] + " ");
                index++;
            }
        }
        System.out.println();

        //closing the scanner object
        input.close();
    }
}
