//Creating Class with name Average_marks indicating the purpose is to display result.
public class Average_marks{
    public static void main(String[] args){
    
    //Create a Integer variable name 'mathMarks' and assign value 94.
    int mathMarks = 94;
    
    //Create a Integer variable name 'physicsMarks' and assign value 95.
    int physicsMarks = 95 ;

    //Create a Integer variable name 'chemistryMarks' and assign value 96.
    int chemistryMarks = 96 ;

    // Since average = sum of all values divided by number of values.
    int average = (mathMarks + physicsMarks + chemistryMarks ) /3 ;
   
    //Display the result
    System.out.print("Sam's average mark in PCM is " + average);

    }
}
