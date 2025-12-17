public class Divide_pens{
    public static void main(String[] args){
    
    //Create integer variables and assigning values 
    int numberOfPens = 14;
    int numberOfStudents = 3;
    int pensPerStudents = numberofPens/numberOfStudents;
    int nonDistributedPens = numbeOfPens%numberOfStudents;

    //Display the result
    System.out.println(" The Pen Per Student is " + pensPerStudents + "and the remaining pen not distributed is " + nonDistributedPens);

    }
}