class FindPercentageOfSam{
     public static void main(String[] args){
          
           //Taking Variable as String as name.
           String name = "Sam";
           
           //Taking Variable as Integer - marks of sam in chemistry subject.
           int marksInChemistry = 94;

           //Taking Variable as Integer - marks of sam in chemistry subject.
           int marksInPhysics = 95;
 
           int marksInMaths = 96;

           
           //Taking Variable as Integer - marks of sam in chemistry subject.
           int totalMarksGained = marksInChemistry + marksInPhysics + marksInMaths;
           
           //Taking Total marks as 300 because the total marks of each subject is 100.
           int totalMarks = 300;

           //calculating the Average percentage of Sam scored in the physics + chemistry + maths.
           //Formula used -- > Percentage = (((sum of each marks)*100)/totalmarks)
           int percentageScoredBySam = (totalMarksGained * 100) / totalMarks;
 
           //printing the average percentage of sam scored in pcm.
           System.out.println(name+"'s average mark in PCM is " + percentageScoredBySam); 
     } 
}