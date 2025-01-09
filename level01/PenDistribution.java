class PenDistribution{
     public static void main(String[] args){
           
           //Taking Total pens as integer.
           int totalPens = 14;
           
           //Taking Total Students count as Integer.
           int totalStudents = 3;
 
           //Calculating the Distribution per head.
           int penPerStudents = totalPens / totalStudents;

           //Calculating the pen which can not be distributed in to the students.
           int penLeft = totalPens % totalStudents; 

           //Printing the output to the screen.
           System.out.println("The Pen Per Student is " + penPerStudents + " and the remaining pen not distributed is " + penLeft);

     }
}