class FindAgeOfHarry{
      public static void main(String[] args){
            
            //Taking variable of String as - name = "Harry"
            String name = "Harry";
            //Taking integer variable as Year when harry was born.
            int yearOfBirth = 2000;
            //Taking integer variable as current year according to calender.
            int currentYear = 2024;
            //Calculaing current age of Harry by Subtracting  ----->     current Year - Year when Harry was born. 
            int currentAge = currentYear - yearOfBirth;
            //Printing the statement that - " Harry was born in year 2000 and The current year is 2024 so, The current age of Harry is 24.
            System.out.println(name+"'s Age is " + currentAge);
      }
}