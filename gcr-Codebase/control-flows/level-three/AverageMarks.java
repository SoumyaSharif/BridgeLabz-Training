import java.util.Scanner;

public class AverageMarks{
    public static void main(String[] args){
        
        //using Scanner to input values given by the user 
        Scanner sc = new Scanner(System.in);
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int maths = sc.nextInt();

        //Checking and printing the output Average marks , grades and remarks
        int average = (physics + chemistry + maths)/3 ;
        int Grade = (physics + chemistry + maths)/3;

        if(Grade>=80 ){
            System.out.print("Level 4 , above agency-normalized standards . Grade : A " + average );
        }
        else if(Grade>69 && Grade<80 ){
            System.out.print("Level 3 , at agency-normalized standards . Grade : B " + average );
        }
        else if(Grade>59 && Grade<70 ){
            System.out.print("Level 2 , below , but approaching agency-normalized standards . Grade : C "+ average );
        }
        else if(Grade>49 && Grade<60 ){
            System.out.print("Level 1 , well below agency-normalized standards  . Grade : D " + average );
        }
        else if(Grade>39 && Grade<50 ){
            System.out.print("Level 1- , too below agency-normalized standards  . Grade : E " + average );
        }
        else if(Grade>=39){
            System.out.print("Remedial standards. Grade : R " + average );
        }
    }
}