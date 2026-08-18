package week3.day12.classworkquestions;

public class Bottle {

    //data variables
    static String brand  = "Pigeon"; //Static variable
    int capacity ; // Instance variable
    String colour ;


    //methods
    public void Refill(){
        System.out.println("Bottle Refilled ");
    }

    public static void main(String[] args) {

        Bottle bottle1 = new Bottle();

        bottle1.colour = "Black" ;
        String colourOfBottleCap = bottle1.colour ; // reference Variable

        bottle1.Refill();
        System.out.println(colourOfBottleCap);

    }

}
